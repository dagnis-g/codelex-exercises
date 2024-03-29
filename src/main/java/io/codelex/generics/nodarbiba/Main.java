package io.codelex.generics.nodarbiba;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk();
        Bottle<Milk> milkBottle = new Bottle<>(milk);
        milkBottle.printOutContents();

        Water water = new Water();
        Bottle<Water> waterBottle = new Bottle<>(water);
        waterBottle.printOutContents();

        Bottle<Vodka> vodkaBottle = createBottleWithContents(new Vodka());
        vodkaBottle.printOutContents();
    }

    public static <T extends Liquid> Bottle<T> createBottleWithContents(T contents) {
        return new Bottle<>(contents);
    }
}
