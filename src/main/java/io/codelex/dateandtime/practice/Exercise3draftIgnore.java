package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise3draftIgnore {
    public static void main(String[] args) {

        LocalDate firstStart = inputDateToLocalDate("01-01-2022");
        LocalDate firstEnd = inputDateToLocalDate("15-01-2022");

        long dayCountInFirstPeriod = ChronoUnit.DAYS.between(firstStart, firstEnd);
        System.out.println("Days between first dates: " + dayCountInFirstPeriod);

        List<LocalDate> firstPeriodDates = new ArrayList<>();
        for (int i = 0; i <= dayCountInFirstPeriod; i++) {
            firstPeriodDates.add(firstStart.plusDays(i));
        }
        System.out.println(firstPeriodDates);

        /////////////////////////////////////////////////////////

        LocalDate secondStart = inputDateToLocalDate("10-01-2022");
        LocalDate secondEnd = inputDateToLocalDate("25-01-2022");

        long dayCountInSecondPeriod = ChronoUnit.DAYS.between(secondStart, secondEnd);
        System.out.println("Days between second dates: " + dayCountInFirstPeriod);

        List<LocalDate> secondPeriodDates = new ArrayList<>();
        for (int i = 0; i <= dayCountInSecondPeriod; i++) {
            secondPeriodDates.add(secondStart.plusDays(i));
        }
        System.out.println(secondPeriodDates);

        //////////////////////////////////////////////////////////

        List<LocalDate> overlapDates = new ArrayList<>();
        for (LocalDate i : firstPeriodDates) {
            for (LocalDate j : secondPeriodDates) {
                if (i.isEqual(j)) {
                    overlapDates.add(j);
                }
            }
        }

        System.out.println("Overlapping dates:");
        System.out.println(overlapDates);

        System.out.println("Overlapping period is from " + overlapDates.get(0) + " to " + overlapDates.get(overlapDates.size() - 1));

    }

    private static LocalDate inputDateToLocalDate(String date) {
        int[] splitDate = Arrays.stream(date.split("-")).mapToInt(Integer::parseInt).toArray();
        return LocalDate.of(splitDate[2], splitDate[1], splitDate[0]);
    }
}
