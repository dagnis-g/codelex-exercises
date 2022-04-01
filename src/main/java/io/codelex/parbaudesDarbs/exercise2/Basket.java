package io.codelex.parbaudesDarbs.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private final List<T> basket = new ArrayList<>();
    private int itemCount;

    public Basket() {
        this.itemCount = 0;
    }

    public List<T> getBasket() {
        return basket;
    }

    public void addToBasket(T item) throws BasketFullException {
        if (basket.size() >= 10) {
            throw new BasketFullException();
        }
        basket.add(item);
        itemCount++;
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (basket.size() == 0) {
            throw new BasketEmptyException();
        }
        basket.remove(item);
        itemCount--;
    }
}
