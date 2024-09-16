package org.example.e147;

import org.example.e87.Car;

class CarObject{
    private String model;
    private double price;
    private int quantity;

   CarObject(String model,double price, int quantity){
       this.model=model;
       this.price=price;
       this.quantity=quantity;
   }
     void carStockValue(){
       double totalValue=price*quantity;
         System.out.println(model +" Stock Value "+ totalValue);
     }
}


public class E147ThisKeyword {
    public static void main(String[] args) {
       CarObject car1 = new CarObject("Toyota 2019",50000.0,50);
        CarObject car2 = new CarObject("BMW 2019",10883.0,60);
        car1.carStockValue();
        car2.carStockValue();



    }
}
