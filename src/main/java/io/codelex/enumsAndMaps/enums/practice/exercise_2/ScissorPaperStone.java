package io.codelex.enumsAndMaps.enums.practice.exercise_2;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ScissorPaperStone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("##.##");

        System.out.println("Let us begin...");
        int trials = 0;
        int wins = 0;
        int losses = 0;

        while (true) {
            System.out.println("Scissor-paper-stone");
            System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String myTurnInput = scan.nextLine().toLowerCase();

            if (!checkIfValidInput(myTurnInput)) {
                System.out.println("Invalid input, try again....");
                continue;
            }
            if (myTurnInput.equals("q")) {
                double winOutput = Double.parseDouble(formatter.format((double) wins / trials * 100));
                double lossOutput = Double.parseDouble(formatter.format((double) losses / trials * 100));

                System.out.println("Number of trials: " + trials);
                System.out.print("I won " + wins + "(" + winOutput + "%)" + ". ");
                System.out.println("Pc won " + losses + "(" + lossOutput + "%)" + ".");
                System.out.println("Bye!");

                break;
            }

            SpsEnum myTurn = SpsEnum.getTurnEnumFromInput(myTurnInput);
            SpsEnum pcTurn = getPcTurn();

            System.out.println("My turn: " + myTurn);
            System.out.println("PC turn: " + pcTurn);

            assert myTurn != null;
            String winner = getWinner(myTurn, pcTurn);
            System.out.println(winner);

            assert winner != null;
            wins += countWins(winner);
            losses += countLosses(winner);

            System.out.println();
            trials++;
        }

    }

    public static int countWins(String winner) {
        if (winner.equals("You Won!!")) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int countLosses(String winner) {
        if (winner.equals("You Lose!!")) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean checkIfValidInput(String myTurnInput) {
        return myTurnInput.equals("s")
                || myTurnInput.equals("p")
                || myTurnInput.equals("t")
                || myTurnInput.equals("q");
    }

    public static SpsEnum getPcTurn() {
        Random random = new Random();
        int index = random.nextInt(3);
        String[] turns = {"s", "p", "t"};

        return SpsEnum.getTurnEnumFromInput(turns[index]);
    }

    public static String getWinner(SpsEnum myTurn, SpsEnum pcTurn) {
        String won = "You Won!!";
        String lose = "You Lose!!";
        if (myTurn.equals(pcTurn)) {
            return "Tie";
        }
        if (myTurn.equals(SpsEnum.PAPER) && pcTurn.equals(SpsEnum.STONE)) {
            return won;
        }
        if (myTurn.equals(SpsEnum.PAPER) && pcTurn.equals(SpsEnum.SCISSORS)) {
            return lose;
        }
        if (myTurn.equals(SpsEnum.SCISSORS) && pcTurn.equals(SpsEnum.STONE)) {
            return lose;
        }
        if (myTurn.equals(SpsEnum.SCISSORS) && pcTurn.equals(SpsEnum.PAPER)) {
            return won;
        }
        if (myTurn.equals(SpsEnum.STONE) && pcTurn.equals(SpsEnum.PAPER)) {
            return lose;
        }
        if (myTurn.equals(SpsEnum.STONE) && pcTurn.equals(SpsEnum.SCISSORS)) {
            return won;
        }
        return null;

    }

}
