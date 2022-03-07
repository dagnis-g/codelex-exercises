package io.codelex.arrays.exercises;

import java.util.*;

public class Exercise_8 {
    public static void main(String[] args) {
        hangman();
    }

    private static void hangman() {
        Scanner scan = new Scanner(System.in);
        String[] wordsToChooseFrom = {"write", "program", "game", "letter", "display", "random"};
        Random random = new Random();
        int indexOfWord = random.nextInt(wordsToChooseFrom.length);
        String[] chosenWord = wordsToChooseFrom[indexOfWord].split("");

        ArrayList<String> misses = new ArrayList<>();
        String[] wordWhileGuess = new String[chosenWord.length];
        Arrays.fill(wordWhileGuess, "_");

        for (int i = 0; i < chosenWord.length * 2; i++) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            for (String item : wordWhileGuess) {
                System.out.print(item + " ");
            }
            System.out.println();
            System.out.print("Guess letter: ");
            String letterGuess = scan.nextLine();

            for (int l = 0; l < chosenWord.length; l++) {
                if (letterGuess.equals(chosenWord[l])) {
                    wordWhileGuess[l] = letterGuess;
                }
            }

            List<String> temp = Arrays.asList(chosenWord);
            if (!temp.contains(letterGuess)) {
                misses.add(letterGuess);
            }

            System.out.print("Misses: ");
            for (String miss : misses) {
                System.out.print(miss + " ");
            }

            System.out.println();
            System.out.println("Guess: " + letterGuess);
            System.out.println();

            if (Arrays.stream(wordWhileGuess).noneMatch(s -> Objects.equals(s, "_"))) {
                System.out.println("YOU GOT IT!");
                System.out.println("Play \"again\" or \"quit\"? quit");
                String playAgainOrQuit = scan.nextLine();
                if (playAgainOrQuit.equalsIgnoreCase("again")) {
                    hangman();
                } else if (playAgainOrQuit.equalsIgnoreCase("quit")) {
                    System.exit(0);
                }
            }
        }
        System.out.println("You hang");
    }
}
