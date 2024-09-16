package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
    int morningExpense = 25;
    int afternoonExpense = 25;
    double  eveningExpense =  26.25;
        // Calculate total expense

    double totalExpense = morningExpense + afternoonExpense + eveningExpense;
        // Define a budget
    double budget = 100.0;
        // Check if within budget
    if (budget > totalExpense){
    System.out.println ("Your total daily expense is: "+ totalExpense);
    System.out.println ("You are within the budget.");

   }else {
    System.out.println("Over the budget.");
   }










    }
}
