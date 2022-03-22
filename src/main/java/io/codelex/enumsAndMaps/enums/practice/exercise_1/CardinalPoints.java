package io.codelex.enumsAndMaps.enums.practice.exercise_1;

public enum CardinalPoints {
    North("up"),
    South("down"),
    East("right"),
    West("left");

    private final String direction;

    CardinalPoints(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
