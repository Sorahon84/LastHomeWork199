package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];
        // Use nested loops to fill the 2D array with multiplication table values

        for (int r = 6; r < 11; r++) {
            for (int c = 1; c < 11; c++) {
                System.out.print(r * c + " ");
            } // Use nested loops to iterate through the 2D array and print the pattern
            System.out.println();
        }







    }

}




//System.out.print(table[r][c] + " ");







//  System.out.print(table[r][c] + " ");
//  for (int r=0; r < table.length; r++){
//            for(int c = 0; c < table.length; c++){