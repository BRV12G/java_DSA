package java_basics_section1.Switchcases.ASSignment2;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whos factors are to be listed");
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
