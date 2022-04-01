package io.codelex.parbaudesDarbs.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    Basket<Apple> appleBasket = new Basket<>();

    @Test
    void shouldThrowExceptionIfTryingToTakeFromEmptyBasket() {
        Assertions.assertThrows(BasketEmptyException.class, () -> {
            appleBasket.removeFromBasket(new Apple());
        });
    }

    @Test
    void shouldThrowExceptionIfTryingToAddMoreThan10Items() {
        Assertions.assertThrows(BasketFullException.class, () -> {
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());
            appleBasket.addToBasket(new Apple());

        });
    }

    @Test
    void shouldAllowToAdd10Items() throws BasketFullException {
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        Assertions.assertEquals(appleBasket.getBasket().size(), 10);

    }
}
