package org.example.e189;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class E189Set {
    public static void main(String[] args) {
        LinkedHashSet<String> emailSet = new LinkedHashSet<>();
        emailSet.add("null");
        emailSet.add("john.doe@example.com");
        emailSet.add("jane.smith@example.com");
        emailSet.add("john.doe@example.com");
        emailSet.add("admin@event.com");
        emailSet.add("info@company.com");
        System.out.println("Email List using For-Each:");
       for(String email: emailSet){
           System.out.println(email);

       }
        System.out.println();
        System.out.println("Email List using Iterator:");
        Iterator<String> iterator = emailSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }










}

}
