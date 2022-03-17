package io.codelex.oop.cars;

import java.util.*;
import java.util.stream.Collectors;

public class CarService {

    private final List<Car> carList = new ArrayList<>();

    public void addToCarList(Car car) {
        carList.add(car);
    }

    public void removeFromCarList(Car car) {
        carList.remove(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getCarByEngine(Engine engine) {
        List<Car> carsWithRequiredEngine = new ArrayList<>();
        for (Car i : carList) {
            if (i.getEngine() == engine) {
                carsWithRequiredEngine.add(i);
            }
        }
        return carsWithRequiredEngine;
    }

    public List<Car> getBeforeYear(int year) {
        List<Car> carsBeforeRequiredYear = new ArrayList<>();
        for (Car i : carList) {
            if (i.getYearOfManufacture() < year) {
                carsBeforeRequiredYear.add(i);
            }
        }
        return carsBeforeRequiredYear;
    }

    public List<Car> getByPrice(int price) {
        List<Car> carsByPrice = new ArrayList<>();
        for (Car i : carList) {
            if (i.getPrice() == price) {
                carsByPrice.add(i);
            }
        }
        return carsByPrice;
    }

    public List<Car> getMostExpensive() {
        int mostExpensive = 0;
        for (Car i : carList) {
            if (i.getPrice() > mostExpensive) {
                mostExpensive = i.getPrice();
            }
        }
        return getByPrice(mostExpensive);
    }

    public List<Car> getCheapest() {
        List<Integer> prices = new ArrayList<>();
        for (Car i : carList) {
            prices.add(i.getPrice());
        }
        return getByPrice(Collections.min(prices));
    }

    public List<Car> getByNumberOfManufacturers(int count) {
        List<Car> carsWithRequiredAmount = new ArrayList<>();
        for (Car i : carList) {
            if (i.getManufacturerList().size() >= 3) {
                carsWithRequiredAmount.add(i);
            }
        }
        return carsWithRequiredAmount;
    }

    public boolean ifCarIsOnTheList(Car car) {
        return carList.contains(car);
    }

    public List<Car> sortByName(String ascOrDesc) {
        List<Car> sortedList = new ArrayList<>();
        if (ascOrDesc.equalsIgnoreCase("ascending")) {
            sortedList = getCarList()
                    .stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        } else if (ascOrDesc.equalsIgnoreCase("descending")) {
            sortedList = getCarList()
                    .stream()
                    .sorted(Comparator.comparing(Car::getName).reversed())
                    .collect(Collectors.toList());
        }
        return sortedList;
    }

    public List<Car> getCarByManufacturer(Manufacturer manufacturer) {
        List<Car> manfacturerCars = new ArrayList<>();
        for (Car i : carList) {
            if (i.getManufacturerList().contains(manufacturer)) {
                manfacturerCars.add(i);
            }
        }
        return manfacturerCars;
    }

    public List<Car> getByYearAndManufacturer(int year, String parameter) {

        Set<Manufacturer> allManufacturers = new HashSet<>();

        for (Car car : carList) {
            allManufacturers.addAll(car.getManufacturerList());
        }

        List<Car> byManufacturerAndYear = new ArrayList<>();

        switch (parameter) {
            case "<" -> {
                for (Manufacturer i : allManufacturers) {
                    if (i.getYearOfEstablishment() < year) {
                        for (Car car : carList) {
                            if (car.getManufacturerList().contains(i)) {
                                byManufacturerAndYear.add(car);
                            }
                        }
                    }
                }
            }
            case ">" -> {
                for (Manufacturer i : allManufacturers) {
                    if (i.getYearOfEstablishment() > year) {
                        for (Car car : carList) {
                            if (car.getManufacturerList().contains(i)) {
                                byManufacturerAndYear.add(car);
                            }
                        }
                    }
                }
            }
            case "<=" -> {
                for (Manufacturer i : allManufacturers) {
                    if (i.getYearOfEstablishment() <= year) {
                        for (Car car : carList) {
                            if (car.getManufacturerList().contains(i)) {
                                byManufacturerAndYear.add(car);
                            }
                        }
                    }
                }
            }
            case ">=" -> {
                for (Manufacturer i : allManufacturers) {
                    if (i.getYearOfEstablishment() >= year) {
                        for (Car car : carList) {
                            if (car.getManufacturerList().contains(i)) {
                                byManufacturerAndYear.add(car);
                            }
                        }
                    }
                }
            }
            case "=" -> {
                for (Manufacturer i : allManufacturers) {
                    if (i.getYearOfEstablishment() == year) {
                        for (Car car : carList) {
                            if (car.getManufacturerList().contains(i)) {
                                byManufacturerAndYear.add(car);
                            }
                        }
                    }
                }
            }
            case "!=" -> {
                for (Manufacturer i : allManufacturers) {
                    if (i.getYearOfEstablishment() != year) {
                        for (Car car : carList) {
                            if (car.getManufacturerList().contains(i)) {
                                byManufacturerAndYear.add(car);
                            }
                        }
                    }
                }
            }
        }

        return byManufacturerAndYear.stream().distinct().collect(Collectors.toList());
    }

}
