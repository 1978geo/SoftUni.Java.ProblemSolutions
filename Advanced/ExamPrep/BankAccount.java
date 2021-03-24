package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

public class BankAccount {


    private static int accountCount = 1;
    private static double interestRate = 0.02;
    private  int id;
    private double balance;

    public BankAccount() {
        this.id = accountCount;
        accountCount++;

    }

    public int getId() {
        return this.id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest (int years) {
        return  this.balance * interestRate * years;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }
}
