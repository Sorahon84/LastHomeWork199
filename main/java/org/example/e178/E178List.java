package org.example.e178;

import java.util.ArrayList;
import java.util.Scanner;

public class E178List {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 grocery items:");
        for (int i = 0; i < 5; i++) {
            String item = scanner.nextLine();
            if (!grocery.contains(item)) {
                grocery.add(item);
            }
        }
        System.out.println("Unique grocery items:");
        for (String item : grocery) {
            System.out.print(item + " ");
        }
        scanner.close();
    }
}

