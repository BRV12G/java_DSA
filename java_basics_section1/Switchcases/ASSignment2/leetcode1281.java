package java_basics_section1.Switchcases.ASSignment2;

import java.util.Scanner;

public class leetcode1281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int product = 1;
        int sum= 0;

        while (num>0) {
            int digit = num%10;
             product =  product *digit;
             sum = sum+digit;
            num = num/10;
        }
        int diff = product - sum;
        System.out.println("the difference is " + diff);
        
        in.close();
    }
}
