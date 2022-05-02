package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {
    private double gpa;

    public Student(String firstName, String lastName, String adress, int id, double gpa) {
        super(firstName, lastName, adress, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String display() {
        return super.display() + " GPA: " + gpa;
    }
}
