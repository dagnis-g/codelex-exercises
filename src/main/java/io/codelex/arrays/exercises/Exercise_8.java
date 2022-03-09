package io.codelex.arrays.exercises;

import java.util.*;

public class Exercise_8 {
    public static void main(String[] args) {
        hangman();
        playAgainOrNo();
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
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            printWordThatIsBeingGuessed(wordWhileGuess);

            System.out.print("Guess letter: ");
            String letterGuess = scan.nextLine();

            updateWordBeignGuessed(chosenWord, letterGuess, wordWhileGuess);
            checkAndAddMissesIfNeeded(chosenWord, misses, letterGuess);
            printMisses(misses);

            if (isAllLettersGuessedCorrectly(wordWhileGuess)) {
                System.out.println("YOU GOT IT!");
                break;
            }
        }
        System.out.println("You hang");
    }

    private static void playAgainOrNo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Play \"again\" or \"quit\"? quit");
        String playAgainOrQuit = scan.nextLine();
        if (playAgainOrQuit.equalsIgnoreCase("again")) {
            hangman();
        } else if (playAgainOrQuit.equalsIgnoreCase("quit")) {
            System.exit(0);
        }
    }

    private static boolean isAllLettersGuessedCorrectly(String[] wordWhileGuess) {
        return Arrays.stream(wordWhileGuess).noneMatch(s -> Objects.equals(s, "_"));
    }

    private static void updateWordBeignGuessed(String[] chosenWord, String letterGuess, String[] wordWhileGuess) {
        for (int l = 0; l < chosenWord.length; l++) {
            if (letterGuess.equals(chosenWord[l])) {
                wordWhileGuess[l] = letterGuess;
            }
        }
    }

    private static void printWordThatIsBeingGuessed(String[] wordWhileGuess) {
        for (String item : wordWhileGuess) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void printMisses(ArrayList<String> misses) {
        System.out.print("Misses: ");
        for (String miss : misses) {
            System.out.print(miss + " ");
        }
    }

    private static void checkAndAddMissesIfNeeded(String[] chosenWord, ArrayList<String> misses, String letterGuess) {
        List<String> temp = Arrays.asList(chosenWord);
        if (!temp.contains(letterGuess)) {
            misses.add(letterGuess);
        }
    }

}
