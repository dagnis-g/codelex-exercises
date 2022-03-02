package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number to multiply: ");
        int i = in.nextInt();

        System.out.print("Input number of terms : ");
        int n = in.nextInt();

        // todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        int result = i;
        for (int j = 1; j < n; j++) {
            result *= i;

        }
        System.out.println(result);
    }

}
