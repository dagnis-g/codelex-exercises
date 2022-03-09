package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Exercise4 {

    //TODO: Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456,
        };

        // fixme - check if contains number 1245
        int num = 1245;
        if (checkIfArrayContainsNum(myArray, num)) {
            System.out.println("Contains number: " + num);
        } else {
            System.out.println("Doesn't contain number: " + num);
        }

    }

    private static boolean checkIfArrayContainsNum(int[] array, int num) {
        return Arrays.stream(array).anyMatch(i -> i == num);
    }
}
