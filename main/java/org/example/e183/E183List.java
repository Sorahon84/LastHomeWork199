package org.example.e183;

import java.util.LinkedList;

public class E183List {
    public static void main(String[] args) {
        LinkedList<Integer> monthlySale = new LinkedList<>();
        monthlySale.add(11100);
        monthlySale.add(12200);
        monthlySale.add(13300);
        monthlySale.add(14400);
        monthlySale.add(15500);
        monthlySale.add(16600);
        int totalSale=0;
        for (int sale:monthlySale){
            totalSale+=sale;
        }
        System.out.println("Total sales for the year: " + totalSale);
    }
}