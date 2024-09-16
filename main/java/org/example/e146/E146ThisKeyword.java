package org.example.e146;

class Employee {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    Employee() {
        this.name = null;
        this.lastName = null;
        this.employeeId = 0;
        this.startDate = null;
        this.salary = 0;
    }

    Employee(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }

    void printDetails() {
        System.out.println(name + " " + lastName + " " + employeeId + " " + startDate + " " + salary);
    }

}

public class E146ThisKeyword {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.printDetails();
        Employee emp2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
        emp2.printDetails();


    }
}
