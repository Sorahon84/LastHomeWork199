package org.example.e149;

class Vehicle {
    String make;
    int year;

    void display() {
        System.out.println("Vehicle: " + make + ", Year: " + year);
    }
}

class Car extends Vehicle {
    String model;

    void displayCarInfo() {
        display();
        System.out.println("Model: " + model);
    }
}


public class E149Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Toyota";
        car.year = 2020;
        car.model = "Corolla";
        car.displayCarInfo();


    }
}
