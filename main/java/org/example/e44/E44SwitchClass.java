package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner mealType = new Scanner(System.in);
        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        // Capture the meal type input
        int price = mealType.nextInt();
        String cost = "";
            // Calculate price using switch statement
        switch (price) {
            // Case 1
            case 1:
            //    Set price to $5.00
                cost = "5.0";
                System.out.println("The price of your meal is $"+ cost);
                break;
            // Case 2
            case 2:
            //    Set price to $10.00
                cost = "10.0";
                System.out.println("The price of your meal is $"+ cost);
                break;
            // Case 3
            case 3:
            //    Set price to $15.00
                cost = "15.0";
                System.out.println("The price of your meal is $"+ cost);
                break;
            // Default
            default:
            //    Print "Invalid meal type entered"
                System.out.println("Invalid meal type entered");
            // Print the price

            // Output: The price of your meal is $____


        }
    }
}
