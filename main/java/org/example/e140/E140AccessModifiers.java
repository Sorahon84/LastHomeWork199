package org.example.e140;

public class E140AccessModifiers {
    static String maxLength(String[] words) {
        if (words == null || words.length == 0) {
            //return " ";
        }
        String logestWord = words[0];
        for (String word : words) {
            if (word.length() > logestWord.length()) {
                logestWord = word;
            }
        }
        return logestWord;
    }

    public static void main(String[] args) {
        String[] words = {"the", "is", "long"};
        String longestWord = maxLength(words);
        System.out.println("this is " + longestWord);

    }

}
