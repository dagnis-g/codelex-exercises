package io.codelex.loops.exercises;

public class Exercise_8 {
    public static void main(String[] args) {
        asciiFigure(7);
    }

    public static void asciiFigure(int size) {

        String leftSide = "////";
        String rightSide = "\\\\\\\\";
        String stars = "********";

        int sideCount = size - 1;
        int starCount = 0;

        for (int i = 0; i < size; i++) {

            System.out.print(leftSide.repeat(sideCount));
            System.out.print(stars.repeat(starCount));
            System.out.print(rightSide.repeat(sideCount));

            System.out.println();

            sideCount--;
            starCount++;

        }

    }
}