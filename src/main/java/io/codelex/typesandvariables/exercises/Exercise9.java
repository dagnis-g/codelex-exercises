package io.codelex.typesandvariables.exercises;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        showSpeed();
    }

    public static void showSpeed() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter meters:");
        int inputMeters = scan.nextInt();

        System.out.println("Enter hours:");
        int inputHours = scan.nextInt();

        System.out.println("Enter minutes");
        int inputMinutes = scan.nextInt();

        System.out.println("Enter seconds");
        int inputSeconds = scan.nextInt();

        int minutes = inputHours * 60 + inputMinutes;
        int seconds = minutes * 60 + inputSeconds;

        double metersPerSecond = (double) inputMeters / seconds;
        System.out.println("Your speed in meters/second is " + formatted(metersPerSecond));

        double kilometersPerHour = metersPerSecond *  ((double)18 / 5);
        System.out.println("Your speed in km/h is "+ formatted(kilometersPerHour));

        double milesPerHour = kilometersPerHour * 0.62137119;
        System.out.println("Your speed in miles/h is " + formatted(milesPerHour));


    }

    private static String formatted(double num) {
        NumberFormat formatter = new DecimalFormat("0.00000000");
        return formatter.format(num);

    }
}
