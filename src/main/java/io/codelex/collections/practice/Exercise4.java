package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();
        while (true) {
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
            System.out.println();
        }
        System.out.println(names);
    }
}
