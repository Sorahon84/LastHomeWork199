package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);
        // Prompt the user to input a string value
        System.out.print("Please enter a word: ");
        // Read the input string
        String sc = scanner.nextLine();
        // Extract the first 3 letters using the substring() method
        String firstThreeLetters=sc.substring(0,3);
        //String s =sc.substring
        // Print the result in the specified format
        System.out.println("The first 3 letters of " + sc + " is " + firstThreeLetters);
    }
}
