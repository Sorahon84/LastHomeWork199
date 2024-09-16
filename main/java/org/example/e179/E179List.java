package org.example.e179;

import java.util.Iterator;
import java.util.LinkedList;

public class E179List {
    public static void main(String[] args){
        LinkedList<Integer>elements=new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            elements.add(i);
        }
        Iterator<Integer> iterator = elements.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 3 != 0) {
                iterator.remove();
            }
        }
        System.out.println(elements);

    }

}