package java_basics_section1.functions;
import java.util.Scanner;
public class _5_params_int {
    public static void main(String[] args) {
       int res = sum(30,20);
       System.out.println(res); 
       Scanner in = new Scanner (System.in);
       System.out.println("enter num1");
       int num1 = in.nextInt();
       System.out.println("enter num2");
       int num2 = in.nextInt();
       int res1 = sum(num1,num2);
       System.out.println(res1);
    }

    static int sum( int a , int b){
        int sum = a+b;
        return sum;
    }
}
