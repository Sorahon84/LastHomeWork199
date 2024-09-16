package org.example.e195;


import java.util.*;

public class E195Map {

    public static void main(String[] args) {

        // Step 1: Create a Map to group students by subjects
        Map<String, List<String>> studentsBySubject = new HashMap<>();

        // Step 2: Add the data for each subject
        studentsBySubject.put("Mathematics", Arrays.asList("Alice", "Bob"));
        studentsBySubject.put("Science", Arrays.asList("Charlie", "David"));
        studentsBySubject.put("History", Arrays.asList("Eve", "Frank"));

        // Step 3: Print the contents of the map
        System.out.println("From Map (Students by Subject):");
        for (Map.Entry<String, List<String>> entry : studentsBySubject.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + " Students: " + entry.getValue());
        }







        // Create a Map to store students grouped by subject
       // Map<String, List<String>> studentsSubject = new HashMap<>();
       // studentsSubject.put("Mathematics", new ArrayList<>(Arrays.asList("Alice", "Bob")));
        //studentsSubject.put("Science", new ArrayList<>(Arrays.asList("Charlie", "David")));
       // studentsSubject.put("History", new ArrayList<>(Arrays.asList("Eve", "Frank")));

       // System.out.println("From Map (Students by Subject):");
        //for (Map.Entry<String, List<String>> entry : studentsSubject.entrySet()) {
            //System.out.println("Subject: " + entry.getKey() + " Subject: " + entry.getValue());
        //}
    }
}
