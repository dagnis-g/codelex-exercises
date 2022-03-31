package io.codelex.oop.summary.ordersAndInvoices;

import java.math.BigDecimal;

public interface SellableThing {
    String getName();

    BigDecimal getPrice();

    String getFullInfo();
}
