package io.codelex.oop.persons;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("John",
                "Brown",
                "123",
                45,
                "Manager",
                LocalDate.of(2020, 1, 1));

        System.out.println(employee.getInfo());

        Customer customer = new Customer("Jimmy",
                "Black",
                "450",
                24,
                "321",
                11);
        System.out.println(customer.getInfo());
    }
}
