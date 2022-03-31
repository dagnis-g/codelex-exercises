package io.codelex.oop.summary.ordersAndInvoices;

import java.math.BigDecimal;

public abstract class AbstractItem implements Item {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }

    @Override
    public String getFullInfo() {
        return null;
    }
}
