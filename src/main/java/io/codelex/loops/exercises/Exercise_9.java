package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {
        rollTwoDice();
    }

    public static void rollTwoDice() {
        System.out.println("Enter a desired sum(Max 12): ");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int desiredSum = scan.nextInt();

        while (true) {
            int diceOne = random.nextInt(6) + 1;
            int diceTwo = random.nextInt(6) + 1;
            int diceSum = diceOne + diceTwo;
            System.out.println(diceOne + " and " + diceTwo + " = " + diceSum);
            if (diceSum == desiredSum) break;
        }
    }
}
