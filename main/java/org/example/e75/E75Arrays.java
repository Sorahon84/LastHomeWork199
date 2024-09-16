package org.example.e75;

public class E75Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        double[][] numbers = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };
        // Use nested loops to iterate through the 2D array and print each value
        for(double r = 0; r < 3; r++) {
            for (double c = 0; c < 4; c++) {
                System.out.print(numbers[(int)r][(int)c]+ " ");
            }
            System.out.println();
        }
    }
}
