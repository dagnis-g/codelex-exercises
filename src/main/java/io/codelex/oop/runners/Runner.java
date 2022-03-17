package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(360, 300),
    INTERMEDIATE(299, 240),
    ADVANCED(239, 180);

    private final int max;
    private final int min;

    Runner(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public static Runner getFitnessLevel(int minutes) {
        for (Runner i : Runner.values()) {
            if (minutes <= i.max && minutes >= i.min) {
                return i;
            }
        }
        return null;
    }
}
