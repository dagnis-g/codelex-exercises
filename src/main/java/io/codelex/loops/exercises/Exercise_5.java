package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String firstWord = scan.nextLine();

        System.out.println("Enter the second word: ");
        String secondWord = scan.nextLine();

        System.out.print(firstWord);
        for (int i = 0; i < 30; i++) {
            System.out.print(".");
        }
        System.out.print(secondWord);
    }
}
