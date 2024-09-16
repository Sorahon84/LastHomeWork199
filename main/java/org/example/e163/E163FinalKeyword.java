package org.example.e163;

class StringManipulator{
    String str;
    public StringManipulator(String str){
        this.str =str;
    }
    public final String reverseString(){
        return new StringBuilder(str).reverse().toString();
    }
}
 class ArrayManipulator{
    final double avgElements(int[]arr){
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        return (double) sum / arr.length;
    }
}

public class E163FinalKeyword {
    public static void main(String[] args){
        StringManipulator stringManipulator = new StringManipulator("hello");
        System.out.println(stringManipulator.reverseString());
        ArrayManipulator arrayManipulator = new ArrayManipulator();
        int[]arr={3,4,5,6,6};
        System.out.println(arrayManipulator.avgElements(arr));
    }
}
