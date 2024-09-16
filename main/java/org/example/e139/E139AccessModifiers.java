package org.example.e139;

public class E139AccessModifiers {
   public static String alphabetical(String str) {

       StringBuilder result = new StringBuilder();
       result.append(str.charAt(0));

       for (int i = 1; i < str.length(); i++) {
           if(str.charAt(i)>str.charAt(i-1)){
               result.append(str.charAt(i));
           }
       }
       return result.toString();
   }

       public static void main (String[]args){

           System.out.println(alphabetical("hello"));
           System.out.println(alphabetical("software"));
           System.out.println(alphabetical("language"));

       }
}

