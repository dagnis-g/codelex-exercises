package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");

        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Fizzbuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 20 == 0) {
                System.out.println();
            }
        }

    }
}
