package org.example.e157;

class TransactionCalculator{
    int calculateProfit(int profits1,int profits2){
        return profits1 + profits2;
    }
    int calculateProfit(int profits1,int profits2, int profits3){
        return profits1 + profits2 + profits3;
    }
    int calculateProfit(int profits1,int profits2,int profits3,int profits4){
        return profits1 + profits2+  profits3 + profits4;
    }
}

public class E157MethodOverloading {
    public static void main(String[] args) {
        TransactionCalculator calculator=new TransactionCalculator();

        System.out.println(calculator.calculateProfit(20,20));
        System.out.println(calculator.calculateProfit(10,10,10));
        System.out.println(calculator.calculateProfit(5,5,5,5));
    }
}



