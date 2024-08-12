package java_basics_section1.Switchcases.ASSignment2;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = in.nextInt(); //2

        int first = 0;
        int second = 1;
        System.out.println("series is : ");
        for(int i =1 ; i<=n;i++){ // 1 1<2 2 // 2=2
            System.out.print(first + " "); // 0 1
            int next = first + second; // 1 2

            first = second; //1 1
            second = next; //1 2
        }
    }
}
