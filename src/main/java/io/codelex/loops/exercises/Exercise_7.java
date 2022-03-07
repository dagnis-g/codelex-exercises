package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        piglet();
    }

    private static void piglet() {
        System.out.println("Welcome to Piglet!");

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int result = 0;

        while (true) {
            int dice = random.nextInt(6) + 1;

            if (dice == 1) {
                System.out.println("You rolled a " + dice + " and lost!");
                break;
            }

            result += dice;

            System.out.println("You rolled a " + dice + " !");
            System.out.println("Enter S if you want to stop");

            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("S")) {
                System.out.println("You quit with " + result + " points");
                break;
            }
        }
    }
}
