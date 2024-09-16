package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'
        // Declare String variables named 'breed', 'name', and 'color'
        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format
        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog dog = new Dog();
        dog. breed = "Husky";
        dog. name = "Jacky";
        dog. color = "white";
        dog. bark();
        dog. run();
        dog. play();

        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"
        Dog dog1 = new Dog();
        dog1. breed = "Bulldog";
        dog1. name = "Bear";
        dog1. color = "Brown";
        dog1. bark();
        dog1. run();
        dog1. play();

        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyName"
        Dog dog2 = new Dog();
        dog2. breed = "Labrador";
        dog2. name = "Bella";
        dog2. color = "Black";
        dog2. bark();
        dog2. run();
        dog2. play();

        // Call the methods 'bark()', 'run()', and 'play()' for each object


    }
}
