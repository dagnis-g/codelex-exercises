package io.codelex.arrays.exercises;

import java.util.Scanner;

public class Exercise_7 {

    public static void main(String[] args) {
        ticTacToe();
    }

    private static void ticTacToe() {
        Scanner scan = new Scanner(System.in);
        char[][] gameBoardArray = new char[3][3];
        populateBoard(gameBoardArray);

        String gameBoardString = printBoard(gameBoardArray);
        System.out.println(gameBoardString);

        char xOrO;
        boolean isFirstPlayer = true;
        boolean isWinner = false;

        while (gameBoardString.contains(String.valueOf('-'))) {
            if (isFirstPlayer) {
                System.out.println("Player one turn");
                xOrO = 'X';
            } else {
                System.out.println("Player two turn");
                xOrO = 'O';
            }

            while (true) {
                try {
                    System.out.println("Enter row(int 0 - 2): ");
                    int row = scan.nextInt();
                    System.out.println("Enter column(int 0 - 2): ");
                    int column = scan.nextInt();

                    if (gameBoardArray[row][column] != '-') {
                        System.out.println("Pick empty row and column");
                    } else {
                        gameBoardArray[row][column] = xOrO;
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Enter correct numbers (0-2)");
                }
            }

            isWinner = checkIfIsWinner(gameBoardArray);
            if (isWinner) {
                if (isFirstPlayer) {
                    System.out.println("Player one wins");
                } else {
                    System.out.println("Player two wins");
                }
                break;
            }

            gameBoardString = printBoard(gameBoardArray);
            isFirstPlayer = !isFirstPlayer;
            System.out.println(gameBoardString);
        }

        if (!gameBoardString.contains(String.valueOf('-')) && !isWinner) {
            System.out.println("The game has ended in tie");
        }
    }

    private static String printBoard(char[][] gameBoard) {
        StringBuilder gameBoardString = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoardString.append(gameBoard[i][j]).append(" ");
            }
            gameBoardString.append("\n");
        }
        return gameBoardString.toString();
    }

    private static void populateBoard(char[][] gameBoardArray) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoardArray[i][j] = '-';
            }
        }
    }

    private static boolean checkIfIsWinner(char[][] gameBoardArray) {
        return checkWinnerHorizontally(gameBoardArray)
                || checkWinnerDiagonally(gameBoardArray)
                || checkWinnerVertically(gameBoardArray);
    }

    private static boolean checkWinnerHorizontally(char[][] gameBoardArray) {
        return ((gameBoardArray[0][0] == 'X' || gameBoardArray[0][0] == 'O') && gameBoardArray[0][0] == gameBoardArray[0][1] && gameBoardArray[0][1] == gameBoardArray[0][2]) ||
                ((gameBoardArray[1][0] == 'X' || gameBoardArray[1][0] == 'O') && gameBoardArray[1][0] == gameBoardArray[1][1] && gameBoardArray[1][1] == gameBoardArray[1][2]) ||
                ((gameBoardArray[2][0] == 'X' || gameBoardArray[2][0] == 'O') && gameBoardArray[2][0] == gameBoardArray[2][1] && gameBoardArray[2][1] == gameBoardArray[2][2]);
    }

    private static boolean checkWinnerDiagonally(char[][] gameBoardArray) {
        return ((gameBoardArray[0][0] == 'X' || gameBoardArray[0][0] == 'O') && gameBoardArray[0][0] == gameBoardArray[1][1] && gameBoardArray[1][1] == gameBoardArray[2][2]) ||
                ((gameBoardArray[2][2] == 'X' || gameBoardArray[2][2] == 'O') && gameBoardArray[2][2] == gameBoardArray[1][1] && gameBoardArray[1][1] == gameBoardArray[0][2]);
    }

    private static boolean checkWinnerVertically(char[][] gameBoardArray) {
        return ((gameBoardArray[2][2] == 'X' || gameBoardArray[2][2] == 'O') && gameBoardArray[0][0] == gameBoardArray[1][0] && gameBoardArray[1][0] == gameBoardArray[2][0]) ||
                ((gameBoardArray[0][1] == 'X' || gameBoardArray[0][1] == 'O') && gameBoardArray[0][1] == gameBoardArray[1][1] && gameBoardArray[1][1] == gameBoardArray[2][1]) ||
                ((gameBoardArray[0][2] == 'X' || gameBoardArray[0][2] == 'O') && gameBoardArray[0][2] == gameBoardArray[1][2] && gameBoardArray[1][2] == gameBoardArray[2][2]);
    }

}
