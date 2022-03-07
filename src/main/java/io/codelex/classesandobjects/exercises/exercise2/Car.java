package io.codelex.classesandobjects.exercises.exercise2;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double calculateConsumption() {
        return 100 / ((endKilometers - startKilometers) / liters);
    }

    public boolean gasHog() {
        return calculateConsumption() > 15;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5;
    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }

}
