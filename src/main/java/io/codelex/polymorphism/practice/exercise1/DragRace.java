package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Audi audi = new Audi();
        Ford ford = new Ford();
        Mazda mazda = new Mazda();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();

        List<Car> cars = new ArrayList<>(List.of(audi, ford, mazda, bmw, lexus, tesla));

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                for (Car car : cars) {
                    if (car instanceof Nitro) {
                        ((Nitro) car).useNitrousOxideEngine();
                    }
                }

            }
        }

        Car fastestCar = null;
        Integer fastestSpeed = 0;
        for (Car i : cars) {
            if (i.getCurrentSpeed() > fastestSpeed) {
                fastestCar = i;
                fastestSpeed = i.getCurrentSpeed();
            }
        }
        System.out.println("Fastest car and speed: ");
        System.out.println(fastestCar.getClass().getSimpleName());
        System.out.println(fastestSpeed);

    }
}
