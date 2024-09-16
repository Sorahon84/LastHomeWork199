package org.example.e54;

public class E54DoWhileLoop {
    public static void main(String[] args) {
        // Declare a counter variable and set it to 10
int counter = 10;

        // Use a do-while loop to create the countdown from 10 to 1
        do {
            System.out.println(counter);
            // Inside the loop, print the value of counter
            counter--;
            // Decrement the counter by 1
        }  while (counter > 0);
        System.out.println("Countdown complete!");
        // Print "Countdown complete!"
    }
}
