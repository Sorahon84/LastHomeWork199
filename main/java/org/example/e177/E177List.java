package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
    public static void main(String[] args){
        ArrayList<String>chat= new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Remaining messages:");
        for (int i = 0; i < 5; i++) {
            chat.add(scanner.nextLine());
        }
        chat.remove(4);
        chat.remove(2);
        chat.remove(0);
        for(String message: chat){
            System.out.print(message + " ");
        }
        scanner.close();
    }

}
