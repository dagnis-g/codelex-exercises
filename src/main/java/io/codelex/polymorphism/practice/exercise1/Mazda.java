package io.codelex.polymorphism.practice.exercise1;

public class Mazda implements Car, Nitro {
    Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 5;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 5;

    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 40;
    }
}
