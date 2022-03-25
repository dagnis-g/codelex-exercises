package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {
    String jobTitle;

    public Employee(String firstName, String lastName, String adress, int id, String jobTitle) {
        super(firstName, lastName, adress, id);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String display() {
        return super.display() + " Job title: " + jobTitle;
    }
}
