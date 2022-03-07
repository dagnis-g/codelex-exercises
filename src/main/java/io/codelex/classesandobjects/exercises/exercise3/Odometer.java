package io.codelex.classesandobjects.exercises.exercise3;

public class Odometer {

    private int currentMileage;
    private int drivenMileage;

    public Odometer(int mileage) {
        this.currentMileage = mileage;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void increaseMileage() {
        if (this.currentMileage < 999999) {
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
