package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println(Combiner.combineTwoItems(12, BigDecimal.valueOf(12.001)));

        Printer<String> printer = new Printer<>("Print this");
        printer.print();
        System.out.println(printer.getThingToPrint());

        StorageHouse<String> storageHouse = new StorageHouse<>("one");
        storageHouse.addMoreItems("two");
        storageHouse.addMoreItems("three");
        System.out.println(storageHouse.getMaybeFirstItem());
        storageHouse.printItems();

    }
}
