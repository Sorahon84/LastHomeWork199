package org.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter the time of day
        System.out.println("Enter the time of day (morning, afternoon, evening, night)");
        // Capture the time of day input
        String timeOfDay = scanner.next();
        switch (timeOfDay) {
            // Recommend meal using switch statement
            // Print "Recommended meal: Breakfast"
            // Case "morning"
            case "morning":
                System.out.println( "Recommended meal: Breakfast");
               break;
            //    Print "Recommended meal: Breakfast"
            // Case "afternoon"
            case "afternoon":
                System.out.println("Recommended meal: Lunch");
                break;
            //    Print "Recommended meal: Lunch"
            // Case "evening"
            case "evening":
                System.out.println("Recommended meal: Dinner");
                break;
            //    Print "Recommended meal: Dinner"
            // Case "night"
            case "night":
                System.out.println("Recommended meal: Snack");
                break;
            // Default
            //    Print "Invalid time of day entered
            case "midnight":
                System.out.println("Invalid time of day entered");
             break;





        }

























    }
    }
