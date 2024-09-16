package org.example.e98;

public class E98StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'given' and assign the value "Hello Syntax friends" to it
        String given = "Hello Syntax friends";
       // System.out.println(given.concat("Welcome"));
        // Manipulate the string to create a new string "Welcome Syntax family"
String newString=given.replace("Hello","Welcome").replace("friends","family");
        // Print the new string
        System.out.println(newString);



    }
}
