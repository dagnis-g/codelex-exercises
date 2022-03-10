package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DatePeriod {
    public static void main(String[] args) {
//        LocalDate firstStart = LocalDate.of(2022, 1, 1);
//        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
//        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);
//
//        LocalDate secondStart = LocalDate.of(2022, 1, 10);
//        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
//        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2023, 1, 10);
        LocalDate secondEnd = LocalDate.of(2023, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        ////Vai šis ir cheating?
        try {
            DatePeriod overlap = firstPeriod.intersection(secondPeriod);
            System.out.println(overlap.getDatesInPeriod());
        } catch (Exception e) {
            System.out.println("No overlapping dates");
        }

    }

    private final LocalDate start;
    private final LocalDate end;
    private final List<LocalDate> datesInPeriod = new ArrayList<>();

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public List<LocalDate> getDatesInPeriod() {
        long dayCountInPeriod = ChronoUnit.DAYS.between(getStart(), getEnd());
        for (int i = 0; i <= dayCountInPeriod; i++) {
            datesInPeriod.add(start.plusDays(i));
        }
        return datesInPeriod;
    }

    public DatePeriod intersection(DatePeriod datePeriod2) {
        List<LocalDate> overlapDates = new ArrayList<>();
        for (LocalDate i : getDatesInPeriod()) {
            for (LocalDate j : datePeriod2.getDatesInPeriod()) {
                if (i.isEqual(j)) {
                    overlapDates.add(j);
                }
            }
        }
        return new DatePeriod(overlapDates.get(0), overlapDates.get(overlapDates.size() - 1));
    }

}
