package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        // Instantiate an object of the StringBuffer class
        StringBuffer sb = new StringBuffer();
        // Append the value "Hello" to the StringBuffer
        sb.append("Hello ");
        // Append the value sb.append("Hello"); to the StringBuffer
        sb.append("World");
        // Convert the StringBuffer content to uppercase and print it
        String str=sb.toString();
        System.out.println(str.toUpperCase());
    }
}
