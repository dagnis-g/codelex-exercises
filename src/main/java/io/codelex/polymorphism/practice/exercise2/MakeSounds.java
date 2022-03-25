package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Radio radio1 = new Radio();
        Radio radio2 = new Radio();

        Parrot parrot1 = new Parrot();
        Parrot parrot2 = new Parrot();

        Firework firework = new Firework();

        List<Sound> soundMakers = new ArrayList<>(List.of(radio1,
                radio2,
                parrot1,
                parrot2,
                firework
        ));

        for (Sound i : soundMakers) {
            i.playSound();
        }
    }
}
