package io.codelex.flowcontrol.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");
        try {
            long n = in.nextLong();

            if (n <= 0) {
                System.out.println("Number needs to be positive");
            } else if (n >= 10000000000L) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits = 0;
                while (n != 0) {
                    n /= 10;
                    digits++;
                }

                System.out.println("Number of digits in the number: " + digits);
            }


        } catch (InputMismatchException e) {
            System.out.println("The number is not a long");
        }


    }

}
