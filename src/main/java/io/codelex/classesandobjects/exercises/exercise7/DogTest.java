package io.codelex.classesandobjects.exercises.exercise7;

public class DogTest {
    public static void main(String[] args) {

        Dog sparky = new Dog("Sparky", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog buster = new Dog("Buster", "male", lady, sparky);
        Dog coco = new Dog("Coco", "female", molly, buster);
        Dog rocky = new Dog("Rocky", "male", molly, sam);
        Dog max = new Dog("Max", "male", lady, rocky);

        Dog[] dogs = {sparky, sam, lady, molly, buster, coco, rocky, max};
        for (Dog i : dogs) {
            try {
                System.out.println(i.getFatherName());
            } catch (NullPointerException e) {
                System.out.println("Unknown");
            }
        }
        System.out.println();
        System.out.println(coco.hasSameMother(rocky));
        System.out.println(coco.hasSameMother(max));

    }
}
