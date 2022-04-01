package io.codelex.parbaudesDarbs.exercise1;

import java.math.BigDecimal;

public class CardMain {
    public static void main(String[] args) throws NotEnoughFundsException {
//        CreditCard creditCard = new CreditCard(12345, "John Smith", "027", new BigDecimal(300));
//        System.out.println(creditCard.getBalance());
//        creditCard.withdraw(new BigDecimal(401));
//        System.out.println(creditCard.getBalance());

        DebitCard debitCard = new DebitCard(12345, "John Smith", "027", new BigDecimal(300));
        System.out.println(debitCard.getBalance());
        debitCard.addMoney(new BigDecimal(10000));
        System.out.println(debitCard.getBalance());
    }
}
