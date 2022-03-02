package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        numberSquare();
    }

    public static void numberSquare() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Min number: ");
        int min = scan.nextInt();
        System.out.println("Enter Max number: ");
        int max = scan.nextInt();


        for (int i = min; i <= max; i++) {

            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }

            for (int k = min; k < i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }

    }
}
