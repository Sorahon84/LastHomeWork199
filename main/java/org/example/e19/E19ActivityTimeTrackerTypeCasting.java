package org.example.e19;

public class E19ActivityTimeTrackerTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values

       double activities1 = 45.5;
       double activities2 = 30.2;
       double activities3 = 60.7;

        // Calculate total time
        double totalTime = activities1 + activities2 + activities3;

        // Type cast the total time to an int to get total minutes
       int hours = (int) totalTime / 60;


        // Calculate hours and remaining minutes
        int minutes = (int) totalTime % 60;

        // Print the results

        System.out.println("The original total time is " + totalTime + " minutes.");
        System.out.println("The converted time is " + hours + " hours and " + minutes + " minutes.");
    }
}
