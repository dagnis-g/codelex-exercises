package io.codelex.oop.computers;

public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Computer("Ryzen 2600", 16, "RX580", "DIY", "White Model");
        Computer pc2 = new Computer("Ryzen 2600x", 16, "RX590", "DIY", "Black Model");
        Computer pc3 = new Computer("Ryzen 2600x", 16, "RX590", "DIY", "Black Model");

        System.out.println(pc1);
        System.out.println(pc1.equals(pc2));
        System.out.println(pc2.equals(pc3));

        Laptop laptop1 = new Laptop("Ryzen 4600h", 16, "GTX1650", "Dell", "Yoga", 7000);
        Laptop laptop2 = new Laptop("Ryzen 4600h", 16, "GTX1650", "Dell", "Yoga", 7000);
        Laptop laptop3 = new Laptop("Ryzen 4600h", 16, "GTX1650Ti", "Dell", "Yoga", 7000);

        System.out.println(laptop1);
        System.out.println(laptop1.getCpu());
        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptop2.equals(laptop3));
    }
}
