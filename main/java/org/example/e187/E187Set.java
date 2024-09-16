package org.example.e187;

import java.util.HashSet;

public class E187Set {

    public static void main(String[] args) {
        HashSet<String> colorSet = new HashSet<>();
        colorSet.add("Red");
        colorSet.add("Pink");
        colorSet.add("Yellow");
        colorSet.add("White");
        colorSet.add("Black");
        System.out.println("Original Hash Set: " + colorSet);
        System.out.println("Size of the Hash Set: " + colorSet.size());

    }

}
