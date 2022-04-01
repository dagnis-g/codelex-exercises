package io.codelex.parbaudesDarbs.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    int cardNumber;
    String fullname;
    String ccv;
    BigDecimal balance;

    public Card(int cardNumber, String fullname, String ccv, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.fullname = fullname;
        this.ccv = ccv;
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    abstract void addMoney(BigDecimal amount) throws NotEnoughFundsException;

    abstract void withdraw(BigDecimal amount) throws NotEnoughFundsException;
}
