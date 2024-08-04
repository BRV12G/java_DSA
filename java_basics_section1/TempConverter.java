package java_basics_section1;
import java.util.Scanner;


public class TempConverter {

    //TempConvertor

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("enter temperature in celcius ");
    //     float tempc = input.nextFloat();
    //     float tempf = (tempc * 9/5) + 32;
    //     System.out.println(tempf);
    // }
    

    //Odd & Even Number 
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     int num1 = input.nextInt();
    //     if(num1%2==0){
    //         System.out.println("the number is even");
    //     }
    //     else{
    //         System.out.println("The number is odd");
    //     }

    // }


    //Take name as input and print a greeting message for that particular name.

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("enter full name");
    //     String name = input.nextLine();
    //     System.out.println("heloo" + " " + name);

    // }

    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     System.out.println("Enter the Principal amount:");
    //     double P = input.nextDouble();
    //     System.out.println("Enter the Time period in years:");
    //     double T = input.nextDouble();
    //     System.out.println("Enter the Rate of interest in % :");
    //     double R = input.nextDouble();
    //     double SI = (P*R*T)/100;
    //     System.out.println("the si is : " + SI);


    // } 

    //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

    // public static void main(String[] args) {
    //     // Create a Scanner object to read input
    //     Scanner scanner = new Scanner(System.in);

    //     // Prompt the user to enter the first number
    //     System.out.print("Enter the first number: ");
    //     double num1 = scanner.nextDouble();

    //     // Prompt the user to enter the second number
    //     System.out.print("Enter the second number: ");
    //     double num2 = scanner.nextDouble();

    //     // Prompt the user to enter the operator
    //     System.out.print("Enter the operator (+, -, *, /): ");
    //     char operator = scanner.next().charAt(0);

    //     // Variable to store the result
    //     double result = 0;
    //     boolean validOperator = true;

    //     // Perform the calculation based on the operator
    //     if (operator == '+') {
    //         result = num1 + num2;
    //     } else if (operator == '-') {
    //         result = num1 - num2;
    //     } else if (operator == '*') {
    //         result = num1 * num2;
    //     } else if (operator == '/') {
    //         // Check if the denominator is not zero
    //         if (num2 != 0) {
    //             result = num1 / num2;
    //         } else {
    //             System.out.println("Error: Division by zero is not allowed.");
    //             validOperator = false;
    //         }
    //     } else {
    //         System.out.println("Error: Invalid operator.");
    //         validOperator = false;
    //     }

    //     // If a valid operator was entered, print the result
    //     if (validOperator) {
    //         System.out.printf("The result of %.2f %c %.2f is: %.2f%n", num1, operator, num2, result);
    //     }

    //     // Close the scanner
    //     scanner.close();
    // }


    //Take 2 numbers as input and print the largest number.
    // public static void main(String[] args) {
    //     Scanner input = new  Scanner(System.in);
    //     System.out.println("Enter Number one");
    //     double num1 = input.nextDouble();
    //     System.out.println("Enter number two");
    //     double num2 = input.nextDouble();
    //     if(num1 > num2){
    //         System.out.println(num1 + "is larger than " + num2);
    //     }
    //     else
    //     {
    //         System.out.println(num2 + "is larger than " + num1);
    //     }

    //     input.close();

    // }

     
    // 6.Input currency in rupees and output in USD
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter the Amount in rupees");
    //     double rupees = input.nextDouble();

    //     System.out.print("Enter the exchange rate (1 USD = ? INR): ");
    //     double exchangeRate = input.nextDouble();

    //     double dollars = rupees/exchangeRate;

    //     System.out.println(dollars);

    //     input.close();

        
    // }


    //7. To calculate Fibonacci Series up to n numbers
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     System.out.println("Enter the Number of terms");
    //     int n = input.nextInt();

    //     if(n<=0)
    //     {
    //         System.out.println("enter a positive number");
    //     }
    //     else{
    //         long first = 0 , second = 1;

    //         System.out.println("Fibonacci series is: ");
    //         for(int i = 1 ; i<=n;i++){
    //             System.out.print(first + " ");

    //             long next = first + second ;
    //             first = second ;
    //             second = next;
    //         }
    //     }
    // }

    //8. To find out whether the given String is Palindrome or not.
    // public static boolean isPalindrome(String str)
    // {
    //     String rev = "";

    //     boolean ans = false;

    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         rev = rev + str.charAt(i);
    //     }

    //     if (str.equals(rev)) {
    //         ans = true;
    //     }
    //     return ans;
    // }
    // public static void main(String[] args)
    // {
        
    //     String str = "aaa";

    //     str = str.toLowerCase();
    //     boolean A = isPalindrome(str);
    //     System.out.println(A);
    // }

    //9.To find Armstrong Number between two given number.
    






}





    

