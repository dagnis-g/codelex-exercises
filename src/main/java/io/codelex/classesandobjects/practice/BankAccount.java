package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.DecimalFormat;

public class BankAccount {
    private final String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        this.balance += amount;
    }

    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        if (balance < 0) {
            return name + ", " + "-$" + df.format(Math.abs(balance));
        }
        return name + ", " + "$" + df.format(balance);
    }
}

class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Benson", 17.25);
        account.withdraw(20);

        System.out.println(account);
    }
}