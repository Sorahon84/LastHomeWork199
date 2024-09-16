package org.example.e142;

class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies() {
        this.schoolName = null;
        this.batch = 0;
        this.year = 0;
        this.lastDayOfClass = null;
    }

    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }

}


public class E142Constructor {
    public static void main(String[] args) {
        SyntaxTechnologies syntax = new SyntaxTechnologies();
        syntax.display();
        SyntaxTechnologies syntax1 = new SyntaxTechnologies("Syntax" , 6,2020,"07/30/2020");
        syntax1.display();
    }
}

