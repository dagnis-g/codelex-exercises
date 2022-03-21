package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final double weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, double weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    private boolean isSumLessThan300() {
        return getyLength() + getzLength() + getxLength() < 300;
    }

    private boolean validateMinLength() {
        return getxLength() > 30
                && getyLength() > 30
                && getzLength() > 30;
    }

    private boolean validateExpressWeight() {
        return getWeight() <= 15;
    }

    private boolean validateNonExpressWeight() {
        return getWeight() <= 30;
    }

    @Override
    public boolean validate() {
        if (!isSumLessThan300()) {
            System.out.println("Sum is bigger than 300");
        }

        if (!validateMinLength()) {
            System.out.println("At least one of the length measurements is under 30");
        }

        if (isExpress()) {
            if (!validateExpressWeight()) {
                System.out.println("Parcel to heavy for express parcel");
            }
        } else {
            if (!validateNonExpressWeight()) {
                System.out.println("Parcel too light for non express parcel");
            }
        }

        if (isExpress()) {
            return isSumLessThan300()
                    && validateMinLength()
                    && validateExpressWeight();
        } else {
            return isSumLessThan300()
                    && validateMinLength()
                    && validateNonExpressWeight();
        }
    }
}
