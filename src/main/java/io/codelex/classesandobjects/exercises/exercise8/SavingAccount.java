package io.codelex.classesandobjects.exercises.exercise8;

public class SavingAccount {

    private double startingBalance;
    private final double annualInterest;
    private double totalDepositedAmount;
    private double totalWithdrawnAmount;
    private double totalInterest;

    public SavingAccount(double startingBalance, double annualInterest) {
        this.startingBalance = startingBalance;
        this.annualInterest = annualInterest;
    }

    public double getTotalDepositedAmount() {
        return totalDepositedAmount;
    }

    public void setTotalDepositedAmount(double totalDepositedAmount) {
        this.totalDepositedAmount += totalDepositedAmount;
    }

    public double getTotalWithdrawnAmount() {
        return totalWithdrawnAmount;
    }

    public void setTotalWithdrawnAmount(double withdrawnAmount) {
        this.totalWithdrawnAmount += withdrawnAmount;
    }

    public double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(double totalInterest) {
        this.totalInterest += totalInterest;
    }

    public double getBalance() {
        return startingBalance;
    }

    public void withdraw(double amount) {
        setTotalWithdrawnAmount(amount);
        this.startingBalance -= amount;
    }

    public void deposit(double amount) {
        setTotalDepositedAmount(amount);
        this.startingBalance += amount;
    }

    public void addMonthlyInterest() {
        setTotalInterest((startingBalance + annualInterest / 12) - startingBalance);
        startingBalance = startingBalance + annualInterest / 12;
    }
}
