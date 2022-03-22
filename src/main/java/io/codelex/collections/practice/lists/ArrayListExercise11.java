package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements

        ArrayList<String> stringArrayList = new ArrayList<>();

        //TODO: Add 10 values to list

        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");
        stringArrayList.add("d");
        stringArrayList.add("e");
        stringArrayList.add("f");
        stringArrayList.add("g");
        stringArrayList.add("h");
        stringArrayList.add("j");
        stringArrayList.add("k");

        //TODO: Add new value at 5th position

        stringArrayList.add(4, "q");

        //TODO: Change value at last position (Calculate last position programmatically)

        stringArrayList.set(stringArrayList.size() - 1, "w");

        //TODO: Sort your list in alphabetical order

        Collections.sort(stringArrayList);

        //TODO: Check if your list contains "Foobar" element

        System.out.println(stringArrayList.contains("Foobar"));

        //TODO: Print each element of list using loop

        for (String i : stringArrayList) {
            System.out.println(i);
        }
    }

}
