package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Smith", "Street 1", 999, 3.38);
        Employee employee = new Employee("Jane", "Doe", "Street 2", 111, "Product Manager");

        System.out.println(student.display());
        System.out.println(employee.display());
    }
}
