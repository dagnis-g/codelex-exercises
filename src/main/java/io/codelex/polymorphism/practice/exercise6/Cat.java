package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Mammal {
    DecimalFormat f = new DecimalFormat("#.#");
    private final String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return getAnimalType()
                + "[" + getAnimalName()
                + ", " + f.format(getAnimalWeight())
                + ", " + getLivingRegion()
                + ", " + getFoodEaten()
                + ", " + getBreed() + "],";
    }

}
