package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
    String operator = "*";
       int num1 = 10;
       int num2 = 5;

        // Declare two variables for numbers and assign values
    if (operator.equals("+")) {
     int result = num1 + num2;
     System.out.println("The sum is: " + result);

    } else if (operator.equals("-")) {
     int result = num1 - num2;
     System.out.println("The difference is: " + result);

    } else if (operator.equals("*")) {
     int result = num1 * num2;
     System.out.println("The product is: " + result);

    } else if (operator.equals("/")) {

     // Perform the corresponding arithmetic operation
     if (num2 != 0) {
         int result = num1 / num2;
         System.out.println("The quotient is: " + result);
     } else {
         System.out.println("Division by zero is not allowed.");
     }
     }else {
     System.out.println("Invalid operator");
     }














    }
}
