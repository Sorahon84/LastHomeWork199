package org.example.e196;

import java.util.*;

public class E196Map {

    public static void main(String[] args) {
        Map<String, List<String>> employeeDepartment = new HashMap<>();



        List<String> hrEmployees = new ArrayList<>();
        hrEmployees.add("Alice");
        hrEmployees.add("Bob");

        List<String> itEmployees = new ArrayList<>();
        itEmployees.add("Charlie");
        itEmployees.add("David");
        itEmployees.add("Eve");

        // Finance Department Employees
        List<String> financeEmployees = new ArrayList<>();
        financeEmployees.add("Frank");
        financeEmployees.add("Grace");

        employeeDepartment.put("HR", hrEmployees);
        employeeDepartment.put("IT", itEmployees);
        employeeDepartment.put("Finance", financeEmployees);


        //System.out.println("Department and Employees:");
        for (Map.Entry<String, List<String>> entry : employeeDepartment.entrySet()) {
            String department= entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println("Department: " + department + " Employees: " + employees);
        }

    }
}
