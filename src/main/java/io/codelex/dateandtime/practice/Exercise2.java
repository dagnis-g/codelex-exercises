package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter launch date of server(example 13-01-2022): ");
        String launchDate = scan.nextLine();

        LocalDate serverLaunchDate = inputDateToLocalDate(launchDate);
        System.out.println("Enter year of update: ");
        int yearOfUpdate = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter month of update(example: September): ");
        String monthOfUpdate = scan.nextLine();
        int monthNumber = Month.valueOf(monthOfUpdate.toUpperCase()).getValue();

        Period periodBetweenDates = Period.between(serverLaunchDate, LocalDate.of(yearOfUpdate, monthNumber, 1));
        int monthsBetweenLaunchDateAndRequiredUpdate = periodBetweenDates.getYears() * 12 + periodBetweenDates.getMonths();

        System.out.println("Dates for server update in "
                + yearOfUpdate + " " + "month of "
                + monthOfUpdate.toUpperCase() + " are:");
        //sorry par "magic number-3",bet es savādāk neizdomāju,lai loop neapstātos par ātru
        for (int i = 1; i <= monthsBetweenLaunchDateAndRequiredUpdate * 3; i++) {
            if (checkIfYearAndMonthAreEqualToUserInput(serverLaunchDate, i, monthOfUpdate, yearOfUpdate)) {
                System.out.print(serverLaunchDate.plusDays(14L * i).getMonth());
                System.out.print(" ");
                System.out.println(serverLaunchDate.plusDays(14L * i).getDayOfMonth());
            }
        }
    }

    private static boolean checkIfYearAndMonthAreEqualToUserInput(
            LocalDate serverLaunchDate, int i, String monthOfUpdate, int yearOfUpdate) {
        return monthOfUpdate.equalsIgnoreCase(String.valueOf(serverLaunchDate.plusDays(14L * i).getMonth()))
                && yearOfUpdate == serverLaunchDate.plusDays(14L * i).getYear();
    }

    private static LocalDate inputDateToLocalDate(String date) {
        int[] splitDate = Arrays.stream(date.split("-")).mapToInt(Integer::parseInt).toArray();
        return LocalDate.of(splitDate[2], splitDate[1], splitDate[0]);
    }
}
