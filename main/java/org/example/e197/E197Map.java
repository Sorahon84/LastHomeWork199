package org.example.e197;

import java.util.HashMap;
import java.util.Map;

class Dog{
    String name;
    String breed;
    int age;

    public Dog(String name,String breed,int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    public String toString(){
        return "Dog{name='" + name + "', breed='" + breed + "', age=" + age + "}";
    }
}

public class E197Map {
    public static void main(String[] args) {
        Map<Integer, Dog> dogMap = new HashMap<>();
        dogMap.put(1, new Dog("Max", "Labrador", 5));
        dogMap.put(2, new Dog("Bella", "Beagle", 3));
        dogMap.put(3, new Dog("Rocky", "Bulldog", 4));
        for(Map.Entry<Integer,Dog> entry: dogMap.entrySet()){
            System.out.println("Dog ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }
}

