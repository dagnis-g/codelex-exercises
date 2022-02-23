package io.codelex.typesandvariables.exercises;

public class Exercise8 {
    public static void main(String[] args) {
        minutesToYearsAndDays(525961);
    }

    public static void minutesToYearsAndDays(long minutes){
        long hours = minutes/60;
        int day   = (int) (hours/24);
        int years = day/365;
        int remainingDays = day % 365;
        System.out.println("Years: "+years+" "+",full days: "+remainingDays);
    }
}
