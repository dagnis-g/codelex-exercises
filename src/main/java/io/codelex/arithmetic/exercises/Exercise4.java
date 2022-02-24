package io.codelex.arithmetic.exercises;

public class Exercise4 {
    public static void main(String[] args) {
        product1ToN();
    }

    public static void product1ToN() {
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}
