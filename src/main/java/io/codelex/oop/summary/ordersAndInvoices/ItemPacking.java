package io.codelex.oop.summary.ordersAndInvoices;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ItemPacking implements Service {
    static final String name = "Item packing";
    static final BigDecimal price = new BigDecimal(5);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String getFullInfo() {
        return String.format("%-45s%s",
                (getName() + ", " + getPrice() + " EUR"), "=");
    }
}
