package org.example.e191;

import java.util.LinkedHashMap;
import java.util.Map;

public class E191Map {

    public static void main(String[] args) {
        LinkedHashMap<String, Double> product = new LinkedHashMap<>();
        product.put("Laptop" ,1200.99);
        product.put("Smartphone",799.99);
        product.put("Tablet", 499.99);
        product.put("Smartwatch",199.99);
        product.put("Headphones" ,149.99);
        System.out.println("Product Catalog:");
        for(Map.Entry<String,Double>entry: product.entrySet()){
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }

    }
}
