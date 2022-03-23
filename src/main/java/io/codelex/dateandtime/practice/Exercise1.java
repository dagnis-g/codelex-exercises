package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        int WORKING_HOURS_IN_DAY = 8;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start date(example: 01-01-2022)");
        String startDateString = scan.nextLine();
        LocalDate startDate = inputDateToLocalDate(startDateString);

        System.out.println("Enter end date(example: 01-01-2022)");
        String endDateString = scan.nextLine();
        LocalDate endDate = inputDateToLocalDate(endDateString);

        int dayCountBetweenPeriods = (int) startDate.until(endDate, ChronoUnit.DAYS);
        int workingDayCount = 0;

        for (int i = 0; i <= dayCountBetweenPeriods; i++) {
            DayOfWeek today = startDate.plusDays(i).getDayOfWeek();
            if (isWorkDay(today)) {
                workingDayCount++;
            }
        }

        int hoursWorked = workingDayCount * WORKING_HOURS_IN_DAY;
        System.out.println("During this time period, employee worked for " + hoursWorked + " hours");
    }

    private static boolean isWorkDay(DayOfWeek today) {
        return !(today.equals(DayOfWeek.SATURDAY) || today.equals(DayOfWeek.SUNDAY));
    }

    private static LocalDate inputDateToLocalDate(String date) {
        int[] splitDate = Arrays.stream(date.split("-"))
                .mapToInt(Integer::parseInt)
                .toArray();
        return LocalDate.of(splitDate[2], splitDate[1], splitDate[0]);
    }

}
