package io.codelex.classesandobjects.exercises.exercise7;

enum Gender {
    MALE, FEMALE
}

public class DogTest {
    public static void main(String[] args) {

        Dog sparky = new Dog("Sparky", Gender.MALE);
        Dog sam = new Dog("Sam", Gender.MALE);
        Dog lady = new Dog("Lady", Gender.FEMALE);
        Dog molly = new Dog("Molly", Gender.FEMALE);
        Dog buster = new Dog("Buster", Gender.MALE, lady, sparky);
        Dog coco = new Dog("Coco", Gender.FEMALE, molly, buster);
        Dog rocky = new Dog("Rocky", Gender.MALE, molly, sam);
        Dog max = new Dog("Max", Gender.MALE, lady, rocky);

        Dog[] dogs = {sparky, sam, lady, molly, buster, coco, rocky, max};
        for (Dog i : dogs) {
            System.out.println(i.getFatherName());
        }

        System.out.println();
        System.out.println(coco.hasSameMother(rocky));
        System.out.println(coco.hasSameMother(max));
        System.out.println(coco.hasSameMother(sparky));

    }
}
