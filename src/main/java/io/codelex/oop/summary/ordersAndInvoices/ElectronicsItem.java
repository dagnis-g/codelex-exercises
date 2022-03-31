package io.codelex.oop.summary.ordersAndInvoices;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem {
    private final int power;

    public ElectronicsItem(String name, BigDecimal price, int power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public String getFullInfo() {
        return String.format("%-45s%s",
                (super.getFullInfo() + " power: " + power + "W"), "=");
    }
}
