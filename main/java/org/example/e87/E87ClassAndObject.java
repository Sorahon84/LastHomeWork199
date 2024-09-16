package org.example.e87;

import org.example.e86.Student;

public class E87ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Car'
        // Declare a String variable named 'carColor'
        // Declare an integer variable named 'carYear'
        // Declare a String variable named 'carMake'



        // Create the first object of the class 'Car'
        Car car = new Car();
        // Assign the value "Black" to the 'carColor' variable of the first object
        car. carColor ="Black";
        // Assign the value 2019 to the 'carYear' variable of the first object
        car. carYear = 2019;
        // Assign the value "BMW" to the 'carMake' variable of the first object
        car. carMake = "BMW";
        // Create the second object of the class 'Car'
        Car car1 =new Car();
        // Assign the value "White" to the 'carColor' variable of the second object
        car1. carColor = "White";
        // Assign the value 2018 to the 'carYear' variable of the second object
        car1. carYear =  2018;
        // Assign the value "Toyota" to the 'carMake' variable of the second object
         car1. carMake = "Toyota";
        // Print the values of the properties for both objects in the specified format
        System.out.println("Car color is " + car. carColor + " and car year is " + car. carYear + " and car model is " + car. carMake);
        System.out.println("Car color is " +  car1. carColor + " and car year is " + car1. carYear + " and car model is " + car1. carMake );

    }
}
