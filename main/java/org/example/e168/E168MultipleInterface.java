package org.example.e168;

interface Transaction {
    void processTransaction(double amount, String type);
}

interface BankOperations extends Transaction {
    double deposit(double amount);

    double withdraw(double amount);

    double checkBalance();
}

class BankAccount implements BankOperations {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double deposit(double amount) {
        balance += amount;
        processTransaction(amount,"Deposited");
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            processTransaction(amount, "Withdrew");
        } else {
            System.out.println("Transaction failed: Insufficient funds");
        }
        return balance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void processTransaction(double amount, String type) {

            System.out.println("Transaction successful: " + type +" "+ amount);

    }
}

public class E168MultipleInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(00.0);
        account.deposit(100.0);
        account.withdraw(50.0);
        System.out.println("Current Balance: "+ account.checkBalance());
        account.withdraw(200.0);
    }
}
