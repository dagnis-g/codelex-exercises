package io.codelex.parbaudesDarbs.exercise2;

public class BasketMain {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {
        Basket<Apple> appleBasket = new Basket<>();
        Basket<Mushroom> mushroomBasket = new Basket<>();

        Mushroom mushroom = new Mushroom();

        mushroomBasket.addToBasket(mushroom);
        mushroomBasket.removeFromBasket(mushroom);
        mushroomBasket.removeFromBasket(mushroom);

//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
//        appleBasket.addToBasket(new Apple());
    }
}
