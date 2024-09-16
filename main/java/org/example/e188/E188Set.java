package org.example.e188;

import java.util.TreeSet;

public class E188Set {

    public static void main(String[] args) {
        TreeSet<String> countrySet = new TreeSet<>();


        countrySet.add("India");
        countrySet.add("Australia");
        countrySet.add("South Africa");
        countrySet.add("India");
        countrySet.add("America");
        countrySet.add("America");

        System.out.println(countrySet);
    }

}
