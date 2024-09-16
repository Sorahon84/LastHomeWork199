package org.example.e150;


class Person {
    private String name;
    private String lastName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void printEmployeeDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + salary);
    }
}

class Student extends Employee {
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void printStudentDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + grade);
    }
}

class Retiree extends Student {
    private String seniorActivity;

    public String getSeniorActivity() {
        return seniorActivity;
    }

    public void setSeniorActivity(String seniorActivity) {
        this.seniorActivity = seniorActivity;
    }

    public void printRetireeDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + seniorActivity);
    }
}

public class E150Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Joe");
        emp.setLastName("Smith");
        emp.setAge(35);
        emp.setSalary(35000);
        emp.printEmployeeDetails();

        Student stu = new Student();
        stu.setName("Adam");
        stu.setLastName("Smith");
        stu.setAge(15);
        stu.setGrade(10);
        stu.printStudentDetails();

        Retiree ret = new Retiree();
        ret.setName("Frank");
        ret.setLastName("Smith");
        ret.setAge(15);
        ret.setSeniorActivity("tour");
        ret.printRetireeDetails();


    }
}
