package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("In:");
        String word = inp.nextLine();
        // Use a for loop to iterate through the string and print only the vowels
        for (int i = 0; i < word.length(); i++) {
            char let = word.charAt(i);
            if (let=='a'||let=='e'||let=='i'||let=='o'||let=='u'){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println();
    }
}
