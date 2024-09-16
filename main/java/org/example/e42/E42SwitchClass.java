package org.example.e42;

import java.util.Scanner;

public class E42SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter the day of the week
        System.out.println("Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)");
        // Capture the day of the week input
        int dayOfWeek = scanner .nextInt();
        switch (dayOfWeek) {
            // Suggest activity using switch statement
            // Case 1
            //    Print "Activity: Go to the gym"
            case 1:
                System.out.println("Activity: Go to the gym");
                break;
            // Case 2
            //    Print "Activity: Attend a coding meetup"
            case 2:
                System.out.println("Activity: Attend a coding meetup");
                break;
            // Case 3
            //    Print "Activity: Go for a mid-week run"
            case 3:
                System.out.println("Activity: Go for a mid-week run");
                break;
            // Case 4
            //    Print "Activity: Take a cooking class"
            case 4:
                System.out.println("Activity: Take a cooking class");
                break;
            // Case 5
            //    Print "Activity: Movie night"
            case 5:
                System.out.println("Activity: Movie night");
                break;
            // Case 6
            //    Print "Activity: Family day"
            case 6:
                System.out.println("Activity: Family day");
                break;
            // Case 7
            //    Print "Activity: Relax and recharge"
            case 7:
                System.out.println("Activity: Relax and recharge");
                break;
            case 8:
                System.out.println("Invalid day entered");
            // Default
            //    Print "Invalid day entered"

        }
    }
}
// System.out.println("Enter the day of the week (1 for Monday, 2 for Tuesday, 3 for Wednesday, 4 for Thursday, 5 for Friday, 6 for Saturday, 7 for Sunday)");
//        // Capture the day of the week input