package io.codelex.arithmetic.exercises;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercise9 {
    public static void main(String[] args) {
        bmiIndex(90, 184);
    }

    public static void bmiIndex(double weightKg, double heightCentimeters) {
        NumberFormat formatter = new DecimalFormat("##.0");
        double bmi = weightKg / heightCentimeters / heightCentimeters * 10000;
        System.out.println("Your BMI is " + formatter.format(bmi));
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi > 25) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You have good weight");
        }
    }
}
