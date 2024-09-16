package org.example.e160;

class BankAccount{
    private void displayInfo() {
        System.out.println("private displayInfo method");
    }
    private void displayInfo(int balance) {
        System.out.println("private displayInfo method with balance: " + balance);
    }
    static void displayBankInfo(){
        System.out.println("static method without parameter");
    }
    static void displayBankInfo(int branches){
        System.out.println("static method with int parameter: " + branches);
    }
    public void display(){
       displayInfo();
        displayInfo(5000);
    }

}

public class E160MethodOverloading {
    public static void main(String[] args) {
     BankAccount account = new BankAccount();
     account.display();
     BankAccount.displayBankInfo();
     BankAccount.displayBankInfo(20);
    }
}


