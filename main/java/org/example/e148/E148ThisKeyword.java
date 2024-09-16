package org.example.e148;

class ShoppingStore {
    String item;
    double price;
    int quantity;

    ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    double itemTotalPrice() {
        double totalValue = price * quantity;
        System.out.println(item + " Total Value " + totalValue);
        return totalValue;
    }
}


public class E148ThisKeyword {
    public static void main(String[] args) {
        ShoppingStore shop1 = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore shop2 = new ShoppingStore("Mattress", 219.59, 2);
        double total1 = shop1.itemTotalPrice();
        double total2 = shop2.itemTotalPrice();
        double totalSum = total1 + total2;
        System.out.println("You purchased " + totalSum + " Today");


    }
}
   