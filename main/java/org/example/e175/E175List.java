package org.example.e175;

import java.util.ArrayList;

public class E175List {
    public static void main(String[] args){
      ArrayList<Integer>product= new ArrayList<>();
      product.add(111);
      product.add(111);
      product.add(111);
      product.add(999);
      product.add(999);
      product.add(999);
      for(int quantity:product){
          System.out.println(quantity);
       }
    }
}
