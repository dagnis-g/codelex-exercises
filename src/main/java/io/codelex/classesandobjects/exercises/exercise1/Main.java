package io.codelex.classesandobjects.exercises.exercise1;

public class Main {
    public static void main(String[] args) {

        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product iPhone = new Product("iPhone 5s", 999.99, 3);
        Product epson = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        iPhone.printProduct();
        epson.printProduct();

        epson.setAmountAtStart(3);
        epson.printProduct();

        mouse.setPriceAtStart(25.00);
        mouse.printProduct();

    }
}
