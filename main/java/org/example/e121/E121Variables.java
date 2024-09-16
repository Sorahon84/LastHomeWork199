package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    // Declare instance variables
    int intValue;
    double doubleValue;
    char charValue;

    public static void main(String[] args) {
        // Create the first instance of MyClass
        E121Variables obj1 = new E121Variables();
        obj1.intValue = 10;
        obj1.doubleValue = 10.23;
        obj1.charValue = 'a';

        // Create the second instance of MyClass
        E121Variables obj2 = new E121Variables();
        obj2.intValue = 100;
        obj2.doubleValue = 100.23;
        obj2.charValue = 's';

        // Print the values of the first instance
        System.out.println(obj1.intValue);
        System.out.println(obj1.doubleValue);
        System.out.println(obj1.charValue);

        // Print the values of the second instance
        System.out.println(obj2.intValue);
        System.out.println(obj2.doubleValue);
        System.out.println(obj2.charValue);
    }
}
