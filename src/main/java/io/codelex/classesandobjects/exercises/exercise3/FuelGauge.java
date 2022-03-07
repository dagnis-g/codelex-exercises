package io.codelex.classesandobjects.exercises.exercise3;

public class FuelGauge {
    private int fuel;
    private final int fuelEconomy;

    public FuelGauge(int fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public int getFuel() {
        return fuel;
    }

    public int getFuelEconomy() {
        return fuelEconomy;
    }

    public void increaseFuel() {
        if (this.fuel < 70) {
            this.fuel++;
        }
    }

    public void decreaseFuel() {
        if (this.fuel > 0) {
            this.fuel--;
        }
    }

}
