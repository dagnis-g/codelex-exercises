package io.codelex.arrays.exercises;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Exercise_6 {
    public static void main(String[] args) {
        arrayOfTen();
    }

    private static void arrayOfTen() {
        int[] tenIntegers = new int[10];

        Random random = new Random();
        int index = 0;
        for (int i : tenIntegers) {
            tenIntegers[index] = random.nextInt(100) + 1;
            index++;
        }

        int[] copyOfTenIntegers = Arrays.copyOf(tenIntegers, tenIntegers.length);
        tenIntegers[tenIntegers.length - 1] = -7;

        System.out.print("Array tenIntegers:       ");
        System.out.println(Arrays.toString(tenIntegers));
        System.out.println();

        System.out.print("Array copyOfTenIntegers: ");
        System.out.println(Arrays.toString(copyOfTenIntegers));
        
    }

}
