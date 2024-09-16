package org.example.e199;

public class E199Exceptions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println("Trying to access an element...");

            int value = numbers[5];
            System.out.println("The value is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index is out of bounds");
        }

        System.out.println("Program has finished");

    }
}
