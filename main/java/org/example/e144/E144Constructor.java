package org.example.e144;

class StoreProduct{
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct(String label, double price, int stock){
        this(label, price, "misc", false, stock);
    }
    StoreProduct(String label,double price){
        this(label,price, "null",false,0);
    }
    void display(){
        System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }

}

public class E144Constructor {
    public static void main(String[] args) {
        StoreProduct pro1 =new StoreProduct("Eggs" , 3.0, "Produce" , true, 10);
        StoreProduct pro2 = new StoreProduct("Paper Towels", 2.0,24);
        StoreProduct pro3 = new StoreProduct("Paper Towels" , 2.0);

        pro1.display();
        pro2.display();
        pro3.display();
    }
}
