package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    private final String animalName;
    private final String animalType;
    private final double animalWeight;
    private Integer foodEaten = 0;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;

    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

}
