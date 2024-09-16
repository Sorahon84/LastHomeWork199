package org.example.e130;

public class E130StaticKeyword {
    public static void mystery(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // If the number is even, divide it by 2
                System.out.print(arr[i] / 2 +" ");
            } else {
                // If the number is odd, multiply it by 10
                System.out.print(arr[i] * 10 + " ");
            }
        }
    }
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        mystery(numbers);


    }
}
