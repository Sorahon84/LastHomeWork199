package org.example.e186;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class E186Set {
    public static void main(String[] args) {
        Set<String> taskSet = new TreeSet<>();
        taskSet.add("third");
        taskSet.add("first");
        taskSet.add("second");

        System.out.println(taskSet);

        taskSet.clear();
        System.out.println(taskSet);


    }

}
