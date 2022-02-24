package io.codelex.arithmetic.exercises;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(if15(7, 7));
    }

    public static boolean if15(int a, int b) {
        return a == 15 || b == 15 || a + b == 15 || a - b == 15 || b - a == 15;
    }
}
