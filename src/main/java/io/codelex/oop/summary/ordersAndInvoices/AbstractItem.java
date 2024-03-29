package io.codelex.oop.summary.ordersAndInvoices;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class AbstractItem implements Item {

    private final String name;
    private final BigDecimal price;

    public AbstractItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

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
        return name + ", " + price + " EUR,";
    }

}
