package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        phoneKeyPad();
    }

    private static void phoneKeyPad() {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine().toLowerCase();

        System.out.println("Enter a string");

        char[] messageArr = message.toCharArray();

        for (char letter : messageArr) {
            switch (letter) {
                case 'a', 'b', 'c' -> System.out.println(2);
                case 'd', 'e', 'f' -> System.out.println(3);
                case 'g', 'h', 'i' -> System.out.println(4);
                case 'j', 'k', 'l' -> System.out.println(5);
                case 'm', 'n', 'o' -> System.out.println(6);
                case 'p', 'q', 'r', 's' -> System.out.println(7);
                case 't', 'u', 'v' -> System.out.println(8);
                case 'w', 'x', 'y', 'z' -> System.out.println(9);
            }

        }
    }
}
