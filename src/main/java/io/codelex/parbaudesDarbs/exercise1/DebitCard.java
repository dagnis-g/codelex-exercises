package io.codelex.parbaudesDarbs.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(int cardNumber, String fullname, String ccv, BigDecimal balance) {
        super(cardNumber, fullname, ccv, balance);
    }

    @Override
    void addMoney(BigDecimal amount) {
        balance = balance.add(amount);
        if (balance.compareTo(new BigDecimal(10000)) == 1) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    void withdraw(BigDecimal amount) throws NotEnoughFundsException {
        balance = balance.subtract(amount);
        if (balance.compareTo(new BigDecimal(0)) == -1) {
            balance = balance.add(amount);
            throw new NotEnoughFundsException("Not enough money to withdraw");
        }

    }

}
