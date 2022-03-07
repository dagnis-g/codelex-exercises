package io.codelex.classesandobjects.exercises.exercise5;

public class Date {
    private int year;
    private String month;
    private String day;

    public Date(int year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void displayDate() {
        System.out.println(getYear() + "/" + getMonth() + "/" + getDay());
    }

}
