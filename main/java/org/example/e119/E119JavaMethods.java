package org.example.e119;

public class E119JavaMethods {
    public static void main(String[] args) {
        // Students will write the code here.
        System.out.println(censorLetter("computer science", 'e'));
        System.out.println(censorLetter("trick or treat", 't'));
    }
    public static String censorLetter(String input, char censorChar) {
        // Replace all instances of censorChar with "*"
        return input.replace(censorChar,'*');





        //StringBuilder result = new StringBuilder();

      //  for (char c : input.toCharArray()) {
           // if (c == censorChar) {
            //    result.append('*');
           // } else {
            //    result.append(c);
            //}
        //}

        //return result.toString();
    }








}
