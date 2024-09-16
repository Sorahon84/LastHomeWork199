package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string
        String word = inp.nextLine();
        String reversed = "";
        // Remove all spaces and convert the string to lowercase
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        // Check if the string is a palindrome
        if (word.equals(reversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // Print "true" if the string is a palindrome, and "false" otherwise


    }
}
