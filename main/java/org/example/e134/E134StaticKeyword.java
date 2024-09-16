package org.example.e134;

public class E134StaticKeyword {
    public static int countVowels(String s){
       int count =0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("obama"));
        System.out.println(countVowels("happy friday! i love weekends"));


    }

}


