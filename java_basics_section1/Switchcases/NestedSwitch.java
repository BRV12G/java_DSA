package java_basics_section1.Switchcases;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String department =  in.next();

        switch(empid){
            case 1 -> System.out.println("rahul");
            case 2 ->System.out.println("sachin");
            case 3 -> {
                System.out.println("employee 3");
                switch(department){
                    case "IT" -> System.out.println("it department");
                    case "m" -> System.out.println("management department");
                    default -> System.out.println("dept doesnt exist");
                }
            }
            default -> System.out.println("employee doesnt exist");
        }
        in.close();
    }
}
