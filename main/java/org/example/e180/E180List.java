package org.example.e180;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class E180List {
    public static void main(String[] args) {
        LinkedList<Integer> employeeAge = new LinkedList<>();
        employeeAge.add(20);
        employeeAge.add(30);
        employeeAge.add(35);
        employeeAge.add(40);
        employeeAge.add(45);
        employeeAge.add(50);
        employeeAge.add(55);
        employeeAge.add(60);
        employeeAge.add(65);
        employeeAge.add(22);
        Iterator<Integer>iterator=employeeAge.iterator();
        while (iterator.hasNext()) {
            int age = iterator.next();
            if (age < 25 || age > 60) {
                iterator.remove();
            }
        }
        Collections.sort(employeeAge);
        int sum = 0;
      for(int age : employeeAge){
          sum+=age;
      }
      double averageAge=sum / employeeAge.size();

        System.out.println("Remaining ages: " + employeeAge);
        System.out.println("Average age: " + averageAge);

    }
}
