package java_basics_section1.functions;
import java.util.Scanner;
public class _3_sum_returntype_int {
    public static void main(String[] args) {
      int result = sum();  
      System.out.println("The sum is " + result);
    }
    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;

    }
}
