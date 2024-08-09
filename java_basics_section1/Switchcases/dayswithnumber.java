package java_basics_section1.Switchcases;

import java.util.Scanner;

public class dayswithnumber {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();

    switch (number) {
        case 1 -> System.out.println("monday");
        case 2 -> System.out.println("tuesday");
        case 3 -> System.out.println("wed");
        case 4 -> System.out.println("thu");
        case 5 -> System.out.println("fri");
        case 6 -> System.out.println("sat");
        case 7 -> System.out.println("sun");
        default-> System.out.println("invalid day");


    }
    in.close();
    }
}
