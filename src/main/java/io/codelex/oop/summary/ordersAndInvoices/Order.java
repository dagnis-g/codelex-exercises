package io.codelex.oop.summary.ordersAndInvoices;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private final BigDecimal ONE_HUNDRED = new BigDecimal(100);
    private final BigDecimal VAT = new BigDecimal(21);
    private final List<SellableThing> orderList = new ArrayList<>();

    public Order() {
    }

    public void addItemToOrder(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem) {
            if (!((FoodItem) item).getBestBefore().isAfter(LocalDate.now())) {
                throw new BadFoodException();
            }
        }

        orderList.add(item);

    }

    public String getOrderListString() {
        return orderList.stream()
                .map((SellableThing i) -> "= "
                        + (orderList.indexOf(i) + 1)
                        + ". " + i.getFullInfo())
                .collect(Collectors.joining("\n"));
    }

    public BigDecimal getPriceWithoutVAT() {
        return orderList.stream()
                .map(SellableThing::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculateVat() {
        return getPriceWithoutVAT()
                .multiply(VAT)
                .divide(ONE_HUNDRED)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getPriceWithVAT() {
        return getPriceWithoutVAT()
                .add(calculateVat())
                .setScale(2, RoundingMode.HALF_UP);
    }
}
