package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method

        System.out.println(bothEven(8, 19));
    }

    // Create method bothEven with two integer parameters
    public static boolean bothEven(int a, int b){
         if(a % 2 == 0 && b % 2 == 0){
             return true;
         }else {
             return false;
         }
    }
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
}
