package io.codelex.classesandobjects.exercises.exercise2;

import java.util.Scanner;

public class LiterPerKm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);
        Car car2 = new Car(100, 200, 4.5);

        System.out.println("Car one kilometers per liter are " + car.calculateConsumption());
        System.out.println("Car two kilometers per liter are " + car2.calculateConsumption());

        System.out.println("Is car one gashog? " + car.gasHog());
        System.out.println("Is car two economic? " + car2.economyCar());

    }
}
