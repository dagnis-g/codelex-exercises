package io.codelex.oop.summary.ordersAndInvoices;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrdersMain {
    public static void main(String[] args) throws WrongOrderException, BadFoodException {
        FoodItem apple = new FoodItem("Milk", new BigDecimal("0.75"), LocalDate.of(2022, 5, 1));
        ElectronicsItem radio = new ElectronicsItem("Radio", new BigDecimal(25), 100);
        HouseholdItem bucket = new HouseholdItem("Bucket", new BigDecimal(5), "red");
//        HouseholdItem bucketBlue = new HouseholdItem("Bucket", new BigDecimal(5), "blue");

        Order order = new Order();
        order.addItemToOrder(apple);
        order.addItemToOrder(radio);
        order.addItemToOrder(bucket);
//        order.addItemToOrder(bucketBlue);

        ItemPacking itemPacking = new ItemPacking();
        order.addItemToOrder(itemPacking);

        Invoice invoice = new Invoice("INV123", order);
        System.out.println(invoice.printInvoice());

        invoice.send();
        System.out.println(invoice.printInvoice());

//        Invoice invoice2 = new Invoice("ABC12");
//        FoodItem badApple = new FoodItem("Milk", new BigDecimal("0.75"), LocalDate.of(2021, 4, 1));
//        order.addItemToOrder(badApple);
    }
}
