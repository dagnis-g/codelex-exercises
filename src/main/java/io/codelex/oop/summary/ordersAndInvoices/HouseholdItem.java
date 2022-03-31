package io.codelex.oop.summary.ordersAndInvoices;

import java.math.BigDecimal;

public class HouseholdItem extends AbstractItem {
    private final String color;

    public HouseholdItem(String name, BigDecimal price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String getFullInfo() {
        return String.format("%-45s%s",
                (super.getFullInfo() + " color: " + color), "=");
    }
}
