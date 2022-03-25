package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Nitro {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed += 8;
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 30;
    }
}
