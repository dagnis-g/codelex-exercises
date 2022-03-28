package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Mammal extends Animal {
    DecimalFormat f = new DecimalFormat("#.#");
    private final String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(getClass().getSimpleName() + " are not eating that type of food!");
        } else {
            setFoodEaten(food.getQuantity());
        }
    }

    @Override
    public String toString() {
        return getAnimalType()
                + "[" + getAnimalName()
                + ", " + f.format(getAnimalWeight())
                + ", " + getLivingRegion()
                + ", " + getFoodEaten() + "],";
    }
}
