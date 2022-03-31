package io.codelex.oop.summary.ordersAndInvoices;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FoodItem extends AbstractItem {
    private final LocalDate bestBefore;

    public FoodItem(String name, BigDecimal price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    @Override
    public String getFullInfo() {
        return String.format("%-45s%s",
                (super.getFullInfo() + " best before: " + bestBefore), "=");
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }
}
