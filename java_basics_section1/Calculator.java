package java_basics_section1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;


        while(true)//infinite while loop
        {
            System.out.println("Enter the operator ");
            char op = input.next().trim().charAt(0);
            
            if(op == '+' || op== '-' || op =='*' || op==  '/' || op==  '%'){
                
                System.out.println("Enter the 2 numbers");
                double num1 = input.nextDouble();
                double num2 = input.nextDouble();

                if (op=='+')
                {
                    result = num1+num2;
                }
                if (op=='-')
                {
                    result = num1-num2;
                }
                if (op=='*')
                {
                    result = num1*num2;
                }
                if (op=='/')
                {
                    if(num2!=0)
                    {
                        result = num1/num2;
                    }
                    if (num2==0)
                    {
                        break;
                    }
                    
                }
                if (op=='%')
                {
                    result = num1%num2;
                }
                System.out.println("The result of " + num1 + " "+ op + " " + num2 + " is " + result);
                

            }
            else if(op =='X' || op == 'x')
            {
                System.out.println("Calculator exited");
                break;
            }
            else{
                System.out.println("Operator invalid");
            }
            
        }
        input.close();
    }
}
