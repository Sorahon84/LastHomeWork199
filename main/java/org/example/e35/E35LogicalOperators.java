package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to answer if they need a loan
        System.out.println("Do you need a loan? (true/false)");
        // Capture the loan requirement input
        boolean needsLoan = scanner.nextBoolean();
        // Check if the user needs a loan
        // Step 1: Create a Scanner Object
        // Step 2: Check Loan Requirement
        // Step 3: Check Credit Score if Loan is Needed
        // Step 4: Determine Eligibility
        if (needsLoan) {
            System.out.println("What is your credit score?");
            int creditScore = scanner.nextInt();
            if (creditScore < 600) {
                System.out.println("Not eligible");
            } else if (creditScore > 600 && creditScore < 700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (creditScore > 701 && creditScore < 800) {
                System.out.println("Eligible");
            } else if (creditScore > 800) {
                System.out.println("Definitely eligible");
            } else {
                System.out.println("Unknown");
            }
        }        // Step 5: Print Eligibility
    }
}
