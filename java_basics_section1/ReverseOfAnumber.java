package java_basics_section1;
import java.util.Scanner;

public class ReverseOfAnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        long reverse=0;
        long num = input.nextLong();
        long numtemp = num;
        while(num>0){
            long remainder = num%10; //9 , 5 // 0 
            reverse = reverse *10 +remainder; //9 ,  9x10+5 = 95
            num= num/10; // 5 , 0
        }
        System.out.println("Reverse of " + numtemp + " is " + reverse);
        input.close();
    }
}
