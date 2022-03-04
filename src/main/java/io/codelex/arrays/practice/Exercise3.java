package io.codelex.arrays.practice;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        //fixme - calculate sum of all array elements
        int sum = Arrays.stream(numbers).reduce(0, Integer::sum);
        double average = (double) sum / numbers.length;

        //fixme - calculate average value
        NumberFormat formatter = new DecimalFormat("##.00");
        System.out.println("Average value of the array elements is : " + formatter.format(average));

    }
}
