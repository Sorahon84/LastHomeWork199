package org.example.e151;

class BankAccount {
    private String accountHolderName;
    private double balance;
    private String accountNumber;

    public BankAccount(String accountHolderName, double balance, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += balance;
    }

    public void withDraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void printAccountInfo() {
        System.out.println("Account Holder: "+ accountHolderName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Balance: "+ balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolderName, double balance, String accountNumber, double interestRate) {
        super(accountHolderName, balance, accountNumber);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountHolderName, double balance, String accountNumber, double overdraftLimit) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}


public class E151Inheritance {
    public static void main(String[] args) {
        SavingsAccount saving = new SavingsAccount("John Doe", 525.0, "123456789", 0.0);
        saving.deposit(50.0);
        saving.printAccountInfo();

        System.out.println();
        CheckingAccount checking = new CheckingAccount("Jane Smith", 500.0, "987654321", 100.0);
        checking.withdraw(550.0);
        checking.printAccountInfo();


    }
}
