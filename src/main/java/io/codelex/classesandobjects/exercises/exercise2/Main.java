package io.codelex.classesandobjects.exercises.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        Car car = new Car(startKilometers);

        System.out.print("Enter the reading at the pump: ");
        endKilometers = scan.nextDouble();
        System.out.print("How many liters you filled at the pump: ");
        liters = scan.nextDouble();

        car.fillUp((int) endKilometers, liters);

        System.out.println("Car one kilometers per liter are " + car.calculateConsumption());
        System.out.println("Is car gashog? " + car.gasHog());
        System.out.println("Is car economic? " + car.economyCar());
    }
}
