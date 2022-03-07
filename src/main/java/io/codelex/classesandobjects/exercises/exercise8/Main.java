package io.codelex.classesandobjects.exercises.exercise8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("00.00");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your annual interest rate: ");
        double rate = scan.nextDouble();

        System.out.println("Enter your starting balance: ");
        double startingBalance = scan.nextDouble();

        SavingAccount account = new SavingAccount(startingBalance, rate);

        System.out.println("Enter how many months have passed? ");
        int months = scan.nextInt();

        for (int i = 1; i <= months; i++) {
            account.addMonthlyInterest();
            System.out.print("Enter amount to deposit for month number " + i + ":");
            double depositAmount = scan.nextDouble();
            account.deposit(depositAmount);
            System.out.println();

            System.out.print("Enter amount to withdraw for month number " + i + ":");
            double withdrawAmount = scan.nextDouble();
            account.withdraw(withdrawAmount);
            System.out.println();
        }
        System.out.println();
        System.out.println("Total deposited: " + formatter.format(account.getTotalDepositedAmount()));
        System.out.println("Total withdrawn: " + formatter.format(account.getTotalWithdrawnAmount()));
        System.out.println("Your current balance: " + formatter.format(account.getBalance()));
        System.out.print("Total interest: " + formatter.format(account.getTotalInterest()));
    }
}
