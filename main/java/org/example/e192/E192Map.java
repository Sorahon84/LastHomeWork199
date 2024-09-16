package org.example.e192;

import java.util.Map;
import java.util.TreeMap;

public class E192Map {
    public static void main(String[] args){
        TreeMap<String, String> productIds = new TreeMap<>();
        productIds.put("1 item" , "apple");
        productIds.put("2 item" , "banana");
        productIds.put("3 item" , "pear");
        productIds.put("4 item" , "tomato");
        productIds.put("5 item" ,"mango");
        productIds.put("6 item" , "kiwi");
        for(Map.Entry<String,String> entry : productIds.entrySet()){
            System.out.println("Key is " + entry.getKey() + " and value is " + entry.getValue());
        }

    }

}