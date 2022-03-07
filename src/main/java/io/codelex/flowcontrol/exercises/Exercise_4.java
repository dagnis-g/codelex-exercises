package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        printDayInWord();
    }

    private static void printDayInWord() {
        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();

        String dayString;

        switch (day) {
            case 1 -> dayString = "Monday";
            case 2 -> dayString = "Tuesday";
            case 3 -> dayString = "Wednesday";
            case 4 -> dayString = "Thursday";
            case 5 -> dayString = "Friday";
            case 6 -> dayString = "Saturday";
            case 7 -> dayString = "Sunday";
            default -> dayString = "Not a valid day";
        }
        System.out.println(dayString);
    }
}
