package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    void speedUp();

    void slowDown();

    default void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    Integer getCurrentSpeed();

    default String showCurrentSpeed() {
        return getCurrentSpeed().toString();
    }

}
