package io.codelex.parbaudesDarbs.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(int cardNumber, String fullname, String ccv, BigDecimal balance) {
        super(cardNumber, fullname, ccv, balance);
    }

    @Override
    void addMoney(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        if (balance.compareTo(new BigDecimal(100)) == -1) {
            System.out.println("Warning: Low funds");
        }
    }
}
