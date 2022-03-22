package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        while (true) {
            final Scanner scanner = new Scanner(System.in);

            String numeratorStr;
            int numerator = 0;

            try {
                System.out.println("Enter the numerator");
                numeratorStr = scanner.nextLine();

                if (Character.toLowerCase(numeratorStr.charAt(0)) == 'q') {
                    break;
                }

                numerator = Integer.parseInt(numeratorStr);
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);

            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0");
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("You entered bad data.");
            }
        }
    }
}
