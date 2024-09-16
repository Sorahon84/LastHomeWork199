package org.example.e67;

public class E67Arrays {
    public static void main(String[] args) {
        // Create an array of integers and store the values 45, 78, 12, 67, 55, 89, 23, 77, and 88
int [] value = {45, 78, 12, 67, 55, 89, 23, 77, 88};
for (int i = 0; i < value.length; i = i + 2) {
    System.out.print(value[i]+" ");
}
        System.out.println();
        // Use a loop to iterate through the array and print the values at even indices followed by a space
    }
}
