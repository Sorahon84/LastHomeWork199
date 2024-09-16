package org.example.e152;

class Building {
    String location;

    public Building(String location) {
        System.out.println(location);
    }

    public Building() {
        System.out.println("Building Constructor");
    }
}

class House extends Building {
    public House(String location) {
        super(location);
    }
}

public class E152SuperKeyword {
    public static void main(String[] args) {
        House house = new House("Vienna");

    }
}

