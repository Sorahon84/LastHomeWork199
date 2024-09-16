package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        // Capture the coffee type input
        int coffeeType = scanner.nextInt();
        String price ="";
        // Calculate price using switch statement
        switch (coffeeType) {
            // Case 1
            case 1:
                //    Set price to $3.00
                price = "3.0";
                System.out.println("The price of your coffee is $"+ price);
                break;
            // Case 2
            case 2:
                //    Set price to $4.00
                price = "4.0";
                System.out.println("The price of your coffee is $"+ price);
                break;
            // Case 3
            case 3:
                //    Set price to $4.50
                price = "4.5";
                System.out.println("The price of your coffee is $"+ price);
                break;
            // Case 4
            case 4:
                //    Set price to $5.00
                price = "5.0";
                System.out.println("The price of your coffee is $"+ price);
                break;
            // Default
            default:
                //    Print "Invalid coffee type entered
                System.out.println("Invalid coffee type entered");

        }           // Print the price
        // Output: The price of your coffee is $____


    }
}
