package io.codelex.classesandobjects.exercises.exercise3;

public class Odometer {
    private final int MAX_MILEAGE = 999999;

    private int currentMileage;
    private int drivenMileage;

    public Odometer(int mileage) {
        this.currentMileage = mileage;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void increaseMileage() {
        if (this.currentMileage < MAX_MILEAGE) {
            this.currentMileage++;
        } else {
            this.currentMileage = 0;
        }
        drivenMileage++;
    }

    public int getDrivenMileage() {
        return currentMileage;
    }
}
