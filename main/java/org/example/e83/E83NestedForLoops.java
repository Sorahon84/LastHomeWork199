package org.example.e83;

public class E83NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];
        for (int r = 0; r < table.length; r++){
            for (int c = 0; c < table[r].length; c++) {
                table[r][c] = (r + 1) * (c + 1);
            System.out.print(table[r][c] + " ");
    }
    System.out.println();
}
        // Use nested loops to fill the 2D array with multiplication table values

        // Use nested loops to iterate through the 2D array and print the pattern

    }
}
//for (int i =0; i < table.length; i++){
//    for ( int j = 0; j < table.length; j++){
//        System.out.print(table[i][j] + " ");

//  for (int r=0; r < table.length; r++){
//            for(int c = 0; c < table[0].length; c++){