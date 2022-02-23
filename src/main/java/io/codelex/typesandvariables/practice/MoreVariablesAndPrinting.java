package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String teeth;
        String hair;
        String eyes;

        int age;
        int height;
        int weight;

        double heightInCm;
        double weightInKg;

        NumberFormat formatter = new DecimalFormat("##.00");

        name = "Zed A. Shaw";
        age = 35;
        height = 74;  // inches
        heightInCm = height * 2.54;
        weight = 180; // lbs
        weightInKg = weight * 0.453592;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " inches tall.");
        System.out.println("He's " + formatter.format(heightInCm) + " centimeters tall.");
        System.out.println("He's " + weight + " pounds heavy.");
        System.out.println("He's " + formatter.format(weightInKg) + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}