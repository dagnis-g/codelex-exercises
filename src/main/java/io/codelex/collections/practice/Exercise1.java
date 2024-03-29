package io.codelex.collections.practice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results

        ArrayList<String> arrayToList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayToList);

        //todo - replace array with a HashSet and print out the results

        Set<String> arrayToSet = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println(arrayToSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Audi", "Germany");
        hashMap.put("Bmw", "Germany");
        hashMap.put("Honda", "Japan");
        hashMap.put("Mercedes", "Germany");
        hashMap.put("VolksWagen", "Germany");
        hashMap.put("Tesla", "USA");
        System.out.println(hashMap);
    }
}
