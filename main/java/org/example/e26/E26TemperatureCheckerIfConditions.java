package org.example.e26;

public class E26TemperatureCheckerIfConditions {
    public static void main(String[] args) {
        // Declare a variable for temperature and assign a value
int temperature = 25;

        // Check the temperature and print the message

    if (temperature > 30 ) {
        System.out.println(" It's hot outside.");

    } else if (temperature > 20 ) {
        System.out.println("It's warm outside.");

    } else if (temperature > 10 ) {
        System.out.println("It's cool outside.");

    } else if (temperature > 8 ) {
        System.out.println("It's cold outside.");

    }


    }
}
/*Declare Variables

Declare a variable temperature and assign 25 to it.
Check Temperature

Use if-else-if statements to check the value of temperature and print a message based on the following conditions:
If temperature is 30 or above, print "It's hot outside.".
If temperature is 20 or above, but less than 30, print "c".
If temperature is 10 or above, but less than 20, print "It's cool outside.".
If temperature is less than 10, print "It's cold outside.".
Expected Output
It's warm outside.
*/