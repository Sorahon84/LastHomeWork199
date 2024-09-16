package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        // Create an array of strings with size 7
        String[] name = new String[7];
        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array
for (int i = 0; i < name.length; i++){
    System.out.println("Please enter day " + (i+1) + " of the week:");
    name[i]=input.nextLine();
}
for (int i = 0; i < name.length; i++){
    System.out.println(name[i]);
}


        // Use another loop to iterate through the array and print each value on a new line

        // Create a Scanner object to read input from the console

        //name[0] = "Sunday";
       // name[1] = "Monday ";
      //  name[3] = "Tuesday";
      //  name[4] = "Wednesday";
      //  name[5] = "Thursday";
       // name[6] = "Friday";
      //  name[7] = "Saturday";

    }
}
