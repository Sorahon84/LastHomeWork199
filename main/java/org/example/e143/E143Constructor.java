package org.example.e143;

class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    Car(String make, String model, int topSpeed, double price) {
        this(make, model, 4, topSpeed, price);
    }

    Car(int numberOfDoors, int topSpeed, double price) {
        this("unknown", "unknown", numberOfDoors, topSpeed, price);
    }

    Car(String make, String model, int numberOfDoors) {
        this(make, model, numberOfDoors, 90, 0);
    }

    void display() {
        System.out.println(make+ " " +model+ " " +numberOfDoors+ " " +topSpeed+ " " +price);
    }
}

public class E143Constructor {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Prius", 4, 120, 30000.0);
        car1.display();
        Car car2 = new Car("Toyota", "Prius", 4, 120, 30000.0);
        car2.display();
        Car car3 = new Car(4, 120, 30000.0);
        car3.display();
        Car car4 = new Car("Toyota", "Prius", 4, 90, 0.0);
        car4.display();


    }
}


