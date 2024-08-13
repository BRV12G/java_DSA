package java_basics_section1.Switchcases.ASSignment2.intermediate_java_prog;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the n numbers");
        int n = in.nextInt();
        double sum=0;
        int num=0;
        System.out.println("enter the numbers");
        for(int i=1;i<=n;i++){
             
             num = in.nextInt();
             sum = sum+num;
        }
        
        double avg =sum/n;
        System.out.println(avg);
        in.close();
    }
}
