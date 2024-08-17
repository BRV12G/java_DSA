package java_basics_section1.functions;

import java.util.Scanner;

public class _1_sum {
    public static void main(String[] args) {
        // _1_sum instance = new _1_sum();
        // instance.sum();
        sum();
        
    }

    static  void sum(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println(sum);
    }
}
