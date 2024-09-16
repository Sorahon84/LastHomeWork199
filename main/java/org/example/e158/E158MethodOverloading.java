package org.example.e158;

class LoanPaymentCalculator{

        public double calculatePayment(double loanAmount, double annualInterestRate) {
            double monthlyPayment=(loanAmount * (1 + (annualInterestRate / 100))) / 12;
            return monthlyPayment;
        }
    public double calculatePayment(double loanAmount, double annualInterestRate, double numberOfMonths) {
        double monthlyPayment= (loanAmount * (1 + (annualInterestRate / 100))) / numberOfMonths;
        return monthlyPayment;
    }
    public double calculatePayment(double loanAmount, double annualInterestRate, double numberOfMonths, double downPayment) {
        double monthlyPayment= ((loanAmount - downPayment) * (1 + (annualInterestRate / 100))) / numberOfMonths;
        return monthlyPayment;
    }

}

public class E158MethodOverloading {
    public static void main(String[] args){

        LoanPaymentCalculator calculator = new LoanPaymentCalculator();

       String lineSeparator=System.lineSeparator();
       double result1=calculator.calculatePayment(10000,5);
        System.out.printf("%.2f"+ lineSeparator,result1);
        double result2=calculator.calculatePayment(10000,5,24);
        System.out.printf("%.2f"+ lineSeparator,result2);
        double result3=calculator.calculatePayment(10000,5,24,2000);
        System.out.printf("%.2f"+ lineSeparator,result3);

    }
}

