package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter their electricity usage in kWh
        System.out.println("Enter your electricity usage in kWh");
        // Capture the usage input
        int usage = scanner.nextInt();
        double bill;
        if(usage < 0) {
            System.out.println("Invalid usage entered");
            return;
        }
        switch (usage/100) {
            // Calculate bill using switch statement
            // Case 0-100
            case 0:
                //    Multiply usage by $0.12 per kWh
                bill = usage*0.12;
                break;
            // Case 101-200
            case 1:
                //    Multiply usage by $0.15 per kWh
                bill = usage*0.15;
                break;
            // Case 201-300
            case 2:
                //    Multiply usage by $0.20 per kWh
                bill = usage*0.20;
                break;
            // Case 301 and above
            default:
                //    Multiply usage by $0.25 per kWh
                bill = usage*0.25;
                break;
        } // Default
            //    Print "Invalid usage entered"
            // Print the bill
            // Output: Your electricity bill is $____
            System.out.println("Your electricity bill is $" + bill);


 }
}
