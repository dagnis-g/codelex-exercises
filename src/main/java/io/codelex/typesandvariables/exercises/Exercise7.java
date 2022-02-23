package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        countUppercase();

    }

    public static void countUppercase() {
        System.out.println("Enter string to count uppercase characters: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        for (char letter : str.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                count++;
            }
        }
        System.out.println("Number of uppercase characters: " + count);
    }
}
