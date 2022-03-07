package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        VideoStore store = new VideoStore();

        final Scanner keyboard = new Scanner(System.in);

        while (true) {

            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard, store);
                case 2 -> rentVideo(keyboard, store);
                case 3 -> returnVideo(keyboard, store);
                default -> {
                }
            }
            System.out.println("Videos in store: ");
            System.out.println(store.listVideosInStore());
        }
    }

    private static void fillVideoStore(Scanner scanner, VideoStore store) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {

            System.out.println("Enter movie name: ");
            String movieName = scanner.nextLine();
            movieName += scanner.nextLine();
            store.addMovieToInventory(movieName);

            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            store.recieveUserRating(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner, VideoStore store) {
        scanner.nextLine();
        System.out.println("Enter video name you wish to rent: ");
        String movieName = scanner.nextLine();
        store.rentVideo(movieName);
    }

    private static void returnVideo(Scanner scanner, VideoStore store) {
        scanner.nextLine();
        System.out.println("Enter video name you wish to return: ");
        String movieName = scanner.nextLine();
        store.returnVideo(movieName);
        System.out.println("Enter rating");
        int rating = scanner.nextInt();
        store.recieveUserRating(movieName, rating);
    }

}
