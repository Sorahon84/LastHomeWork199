package org.example.e190;

import java.util.LinkedHashMap;

public class E190Map {
    public static void main(String[] args) {
        LinkedHashMap<String, String> addressMap = new LinkedHashMap<>();

        addressMap.put("Street", "Patrick ST");
        addressMap.put("Suite", "265");
        addressMap.put("City", "Vienna");
        addressMap.put("Zip", "22180");
        addressMap.put("Country", "United States");

        // Step 3: Print all address values from the LinkedHashMap
        System.out.println("Address Details:");
        for (String value : addressMap.values()) {
            System.out.println(value);

        }
    }
}
