package io.codelex.enumsAndMaps.enums.practice.exercise_1;

public class Directions {
    public static void main(String[] args) {
        
        for (CardinalPoints i : CardinalPoints.values()) {
            System.out.println(i + ":" + i.getDirection() + ":" + i.ordinal());
        }
    }
}
