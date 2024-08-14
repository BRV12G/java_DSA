package java_basics_section1.Switchcases.ASSignment2.intermediate_java_prog;

import java.util.Scanner;

public class commision_question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for the commission amount
        System.out.println("Enter the commission amount:");
        double commissionAmount = scanner.nextDouble();
        
        // Input for the total sales amount
        System.out.println("Enter the total sales amount:");
        double totalSalesAmount = scanner.nextDouble();
        
        // Check for valid sales amount
        if (totalSalesAmount <= 0) {
            System.out.println("Total sales amount must be greater than zero.");
        } else {
            // Calculate the commission percentage
            double commissionPercentage = (commissionAmount / totalSalesAmount) * 100;
            
            // Print the result
            System.out.printf("The commission percentage is: %.2f%%\n", commissionPercentage);
        }
        
        scanner.close(); // Close the scanner
    }
}
