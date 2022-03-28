package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private double dimensionX;
    private double dimensionY;
    private int copies;

    public Poster(int fee, double dimensionX, double dimensionY, int copies) {
        super(fee);
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.copies = copies;
    }

    public int cost() {
        return fee * copies;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster:" +
                " dimensionX=" + dimensionX +
                " dimensionY=" + dimensionY +
                " copies=" + copies;
    }
}
