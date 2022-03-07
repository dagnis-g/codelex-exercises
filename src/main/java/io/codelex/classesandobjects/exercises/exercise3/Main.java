package io.codelex.classesandobjects.exercises.exercise3;

public class Main {
    public static void main(String[] args) {

        Odometer odometer = new Odometer(0);
        FuelGauge fuelGauge = new FuelGauge(10);

        fillFuel(fuelGauge,10);
        carDriving(fuelGauge, odometer);
    }

    public static void carDriving(FuelGauge fuelGauge, Odometer odometer) {
        while (fuelGauge.getFuel() > 0) {
            System.out.println("Current mileage: " + odometer.getCurrentMileage());
            System.out.println("Current fuel: " + fuelGauge.getFuel());
            odometer.increaseMileage();
            if (odometer.getDrivenMileage() % fuelGauge.getFuelEconomy() == 0) {
                fuelGauge.decreaseFuel();
            }
        }
        System.out.println("Current mileage: " + odometer.getCurrentMileage());
        System.out.println("Current fuel: " + fuelGauge.getFuel());
        System.out.println("You ran out of fuel!!");
    }

    public static void fillFuel(FuelGauge fuelGauge, int litters) {
        for (int i = 0; i < litters; i++) {
            fuelGauge.increaseFuel();
        }
    }
}
