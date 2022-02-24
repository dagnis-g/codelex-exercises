package io.codelex.arithmetic.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");

        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            int guessNum = scan.nextInt();
            if (guessNum < randomNum) {
                System.out.println("Sorry, you are too low.");
            } else if (guessNum > randomNum) {
                System.out.println("Sorry, you are too high.");
            } else {
                System.out.println("You guessed it!  What are the odds?!?");
            }
        }
        System.out.println("I was thinking of " + randomNum);

    }
}
