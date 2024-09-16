package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In:");
        String[] arr = new String[5];
        //write code from here
        for (int i = 0; i < 5; i++) {
         arr[i]=input.nextLine();
            System.out.println(arr[i].substring(0,3));
      }
        System.out.println();









    }
}


