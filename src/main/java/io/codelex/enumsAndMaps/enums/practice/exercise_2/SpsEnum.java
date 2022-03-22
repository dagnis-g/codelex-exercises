package io.codelex.enumsAndMaps.enums.practice.exercise_2;

public enum SpsEnum {
    STONE("t"),
    PAPER("p"),
    SCISSORS("s");

    String turn;

    SpsEnum(String turn) {
        this.turn = turn;
    }

    public String getTurn() {
        return turn;
    }

    public static SpsEnum getTurnEnumFromInput(String value) {
        for (SpsEnum i : SpsEnum.values()) {
            if (i.getTurn().equals(value)) {
                return i;
            }
        }
        return null;
    }

}
