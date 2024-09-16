package org.example.e153;

class Vehicle {
    public Vehicle() {
        System.out.println("This is Parent constructor");
    }
}

class Car extends Vehicle {
    public Car() {
        super();

    }
}

public class E153SuperKeyword {
    public static void main(String[] args) {
        Car car = new Car();

    }
}
