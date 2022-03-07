package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.List;

public class Exercise5 {

    //TODO: Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int indexOfElement36 = 0;
        int indexOfElement29 = 0;

        //fixme
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 36) {
                indexOfElement36 = i;
            }
            if (myArray[i] == 29) {
                indexOfElement29 = i;
            }
        }

//        Integer[] myArray1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        int indexOfElement25 = List.of(myArray1).indexOf(25);
//        System.out.println("Index position of 25 is: " + indexOfElement25);
        
        //Expected output:
        //Index position of 36 is: 4
        //Index position of 29 is: 8

        //fixme
        System.out.println("Index position of 36 is: " + indexOfElement36);
        System.out.println("Index position of 29 is: " + indexOfElement29);

    }
}
