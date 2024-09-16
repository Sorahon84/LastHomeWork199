package org.example.e82;

public class E82NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given pattern values
        String[][] pattern = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };
        // Use nested loops to iterate through the 2D array and print the pattern
        for(int r = 0; r < 6; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(pattern[r][c]+" ");
            }System.out.println();
        }
    }
}
