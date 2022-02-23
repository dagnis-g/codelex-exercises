package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars;
        int seatsInACar;
        int carpoolCapacity;
        int drivers;
        int passengers;
        int carsNotDriven;
        int carsDriven;

        double averagePassengersPerCar;

        cars = 100;
        seatsInACar = 4;
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven * seatsInACar;
        averagePassengersPerCar = passengers / (double) carsDriven;

        NumberFormat formatter = new DecimalFormat("##.00");

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + formatter.format(averagePassengersPerCar) + " in each car.");
    }
}