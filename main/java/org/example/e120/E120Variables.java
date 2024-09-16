package org.example.e120;

public class E120Variables {
    // Declare instance variables
    int year;
    String schoolName;
    int batchNumber;

    // Main method
    public static void main(String[] args) {
        // Create an instance of Student
        E120Variables student = new E120Variables();

        // Assign specific values to instance variables
        student.year = 2020;
        student.schoolName = "Syntax";
        student.batchNumber = 6;

        // Print the values in the specified format
        System.out.println("I am a student of batch " + student.batchNumber +
                " studying at " + student.schoolName +
                " in the year of " + student.year);
    }
}
