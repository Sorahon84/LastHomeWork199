package org.example.e137;

public class E137AccessModifiers {
    String name;
    String city;
    String schoolName;
    int batchNumber;
void total(){
    System.out.println("My name is " + name + " and I live in " + city +
            ". I study at " + schoolName + " in batch " + batchNumber);
}
    public static void main(String[] args) {
        E137AccessModifiers student=new E137AccessModifiers();
        student.name ="John";
        student.city ="Miami";
        student.schoolName="Syntax";
        student.batchNumber=9;
        student.total();

    }
}

