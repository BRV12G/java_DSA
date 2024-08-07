package java_basics_section1;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = input.nextLong();
        System.out.println("enter the number to be checked the occurances");
        long numtocheck = input.nextLong();
        long numtemp = num;
        int count = 0;
        while(num>0){
            long remainder = num % 10;
            if(remainder == numtocheck)
            {
                count++;
            }
            num = num/10;
        }
        System.out.println("The " + numtocheck + " occured " + count + " times  in the " + numtemp );
        input.close();
    }
}
