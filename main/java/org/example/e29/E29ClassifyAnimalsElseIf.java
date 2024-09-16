package org.example.e29;

public class E29ClassifyAnimalsElseIf {
    public static void main(String[] args) {
        // Declare a string variable and assign a value
        String animal = "dog";

        // Use if-else-if conditions to classify the animal
        if (animal.equals("dog")){
            System.out.println("The animal is a mammal.");

        } else if (animal.equals("eagle")){
            System.out.println("The animal is a bird.");
            
        } else if (animal.equals("shark")) {
            System.out.println("The animal is a fish.");

        } else if (animal.equals("frog")) {
            System.out.println("The animal is an amphibian.");

        } else if (animal.equals("shake")) {
            System.out.println("The animal is a reptile.");

        }else {
            System.out.println("Unknown animal type.");
        }

















     /*Use simple if-else-if conditions to classify the animal based on its type.
If animal is "dog", print: The animal is a mammal.
If animal is "eagle", print: The animal is a bird.
If animal is "shark", print: The animal is a fish.
If animal is "frog", print: The animal is an amphibian.
If animal is "snake", print: The animal is a reptile.
If animal does not match any of the above, print: Unknown animal type.
*/






    }
}