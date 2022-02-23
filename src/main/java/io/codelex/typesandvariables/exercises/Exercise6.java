package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        System.out.println("Enter a numbers to sum: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int sum = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println("Sum: " + sum);
    }

}
