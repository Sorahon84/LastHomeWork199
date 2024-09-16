package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        // Use nested loops to iterate through the 2D array and sum the elements that are on even indexes and even row
        int sum = 0;
        for (int i = 0; i < a.length; i += 1) {
            for (int j = 0; j < a.length; j++)
                if (i % 2 == 0 && j % 2 == 0) {
                    sum = sum + a[i][j];
                }
        }
             System.out.println(sum);

    }
}

// Print the calculated sum



//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (a[i][j] < 0 && a[i][j] % 2 != 0) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);







//int[] rowSums = new int [a.length];
//        // Use nested loops to iterate through the 2D array and calculate the sum of each row
//for (int i = 0; i < a.length; i++){
//    int sum = 0;
//    for ( int j = 0; j < a[i].length; j++){
//        sum +=a[i][j];
//    }
//    rowSums[i] = sum;
//}
//for (int sum: rowSums){
//    System.out.println(sum);
//}