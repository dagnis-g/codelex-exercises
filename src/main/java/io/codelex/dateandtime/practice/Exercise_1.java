package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {
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
            String today = String.valueOf(startDate.plusDays(i).getDayOfWeek());
            if (!(today.equalsIgnoreCase("Saturday") || today.equalsIgnoreCase("Sunday"))) {
                workingDayCount++;
            }
        }

        int hoursWorked = workingDayCount * 8;
        System.out.println("During this time period, employee worked for " + hoursWorked + " hours");
    }

    private static LocalDate inputDateToLocalDate(String date) {
        int[] splitDate = Arrays.stream(date.split("-")).mapToInt(Integer::parseInt).toArray();
        return LocalDate.of(splitDate[2], splitDate[1], splitDate[0]);
    }

}
