package io.codelex.arithmetic.exercises;

public class Exrecise8 {
    public static void main(String[] args) {
        totalPay(7.50, 35);
        totalPay(8.20, 47);
        totalPay(10.00, 73);
    }

    public static void totalPay(double basePay, int hoursWorked) {
        int overtime = hoursWorked - 40;
        double overtimePay = basePay * 1.5;

        double payWithoutOvertime = basePay * hoursWorked;
        double payWithOvertime = basePay * 40 + overtime * overtimePay;

        if (basePay < 8) {
            System.out.println("Employee starved");
        } else if (hoursWorked > 60) {
            System.out.println("Employee died from exhaustion");
        } else {
            if (hoursWorked <= 40) {
                System.out.println("Employee earned " + payWithoutOvertime);
            } else {
                System.out.println("Employee earned " + payWithOvertime);
            }
        }
    }
}
