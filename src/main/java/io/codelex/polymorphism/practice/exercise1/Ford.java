package io.codelex.polymorphism.practice.exercise1;

public class Ford implements Car {
    Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 15;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 15;
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
