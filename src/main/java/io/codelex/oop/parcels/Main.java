package io.codelex.oop.parcels;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(31, 100, 200, 13, true);
        Parcel parcel2 = new Parcel(25, 25, 25, 13, true);
        Parcel parcel3 = new Parcel(20, 10, 20, 31, true);
        Parcel parcel4 = new Parcel(20, 10, 20, 13, false);
        Parcel parcel5 = new Parcel(33, 100, 45, 33, false);
        Parcel parcel6 = new Parcel(31, 100, 43, 13, true);

        System.out.println("Parcel1");
        System.out.println("Validate: " + parcel1.validate());
        System.out.println("Parcel2");
        System.out.println("Validate: " + parcel2.validate());
        System.out.println("Parcel3");
        System.out.println("Validate: " + parcel3.validate());
        System.out.println("Parcel4");
        System.out.println("Validate: " + parcel4.validate());
        System.out.println("Parcel5");
        System.out.println("Validate: " + parcel5.validate());
        System.out.println("Parcel6");
        System.out.println("Validate: " + parcel6.validate());

    }
}
