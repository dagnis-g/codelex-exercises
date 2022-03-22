package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter number :");
        int number = scan.nextInt();

        Set<Integer> digits = new HashSet<>();

        while (digits.add(number)) {
            sum = 0;
            while (number > 0) {
                sum += (number % 10) * (number % 10);
                number /= 10;
            }
            number = sum;
        }

        if (sum == 1) {
            System.out.println("Happy");
        } else {
            System.out.println("Not happy");
        }
    }

}



