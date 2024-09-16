package org.example.e141;

public class E141AccessModifiers {
    public static int maxValue(int[] numbers){
       if ( numbers== null || numbers.length==0){

       }
       int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]> max){
                max = numbers[i];
            }
        }
        return max;
    }




    public static void main(String[] args) {

        int[] numbers = {3, 5, 7, 2, 22, 11, 6};
        System.out.println(maxValue(numbers));

    }
}