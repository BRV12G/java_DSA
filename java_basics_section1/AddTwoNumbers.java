package java_basics_section1;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number one");
        int num1 = input.nextInt();
        System.out.println("enter number two");
        int num2 = input.nextInt();
        int sum =  num1 + num2 ;
        System.out.println("The sum is : " + sum);

        
    }
}
