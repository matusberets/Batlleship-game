package Module4Lesson8Arrays;

import java.util.*;
import java.io.*;

public class Battleship {
    public static void main(String[] args) {
        // Create an empty map 2d array for a player filled with dashes
        char[][] mapPlayer1 = new char[5][5];
        fillMapDash(mapPlayer1);
        char[][] mapPlayer2 = new char[5][5];
        fillMapDash(mapPlayer2);

        // Create a history boards for players to see the gameplay status on the end
        char[][] mapPlayer1History = new char[5][5];
        char[][] mapPlayer2History = new char[5][5];
        fillMapDash(mapPlayer1History);
        fillMapDash(mapPlayer2History);

        // helpers variable to print decision when shooting
        boolean shooting = false;

        // store players shooting coordinates
        char[][] playersShoot1 = new char[5][5];
        fillMapDash(playersShoot1);
        char[][] playersShoot2 = new char[5][5];
        fillMapDash(playersShoot2);

        int player1score = 0;
        int player2score = 0;

        String[] playersName = {"PLAYER 1", "PLAYER 2"};
        int[] playersOrderArray = {1,2};
        int playersOrder = 0;
        final int shipsMax = 5;

        Scanner input = new Scanner(System.in);

        //Game Begins! Welcome phrase !
        System.out.println("Welcome to Battleship!\n");

        // ask players 5 times to place 5 ships on your map
        for (int i = 0; i < playersName.length; i++) {
            System.out.printf("%s, ENTER YOUR SHIPS’ COORDINATES.\n", playersName[i]);
            for (int j = 0; j < shipsMax; j++) {
                if (i == 0) {
                    System.out.printf("Enter ship %d location:\n", (j + 1));
                    int playersRow = input.nextInt();
                    int playersCol = input.nextInt();
                    mapPlayer1[playersRow][playersCol] = '@';

                    if (j == 4) {
                        printBattleShip(mapPlayer1);
                        printLines(100);
                    }
                }
                else {
                    System.out.printf("Enter ship %d location:\n", (j + 1));
                    int playersRow = input.nextInt();
                    int playersCol = input.nextInt();
                    mapPlayer2[playersRow][playersCol] = '@';
                    if (j == 4) {
                        printBattleShip(mapPlayer2);
                        printLines(100);
                    }
                }
            }
        }

        // Main gameplay Player1
        while ((player1score < 5) && (player2score <5)) {
            for (int i = 0; i < playersName.length; i++) {
                // keep shooting until all ships are sinked
                System.out.printf("Player %d, enter hit row/column:\n", playersOrderArray[0]);
                int playersRow = input.nextInt();
                int playersCol = input.nextInt();
                // need to save shot into 2array -> s for 'shot'
                playersShoot1[playersRow][playersCol] = 's';

                shooting = false;
                Player1Hit:
                for (int row = 0; row < mapPlayer2.length; row++) {
                    for (int col = 0; col < mapPlayer2[row].length; col++) {
                        if ((mapPlayer2[row][col] == '@') && (playersShoot1[row][col] == 's')) {
                            mapPlayer1History[row][col] = 'X';
                            System.out.printf("%s HIT %s’s SHIP!\n", playersName[0], playersName[1]);
                            printBattleShip(mapPlayer1History);
                            System.out.println("");
                            player1score++;
                            // return value back to '-' empty ..
                            playersShoot1[playersRow][playersCol] = '-';
                            shooting = true;
                            break Player1Hit;
                        }
                    }
                }
                if (player1score == 5) break;
                if (!shooting) {
                    System.out.printf("%s MISSED!\n", playersName[0]);
                    mapPlayer1History[playersRow][playersCol] = 'O';
                    // return value back to '-' empty ..
                    playersShoot1[playersRow][playersCol] = '-';
                    printBattleShip(mapPlayer1History);
                    System.out.println("");
                }

                // Gameplay Player2
                // keep shooting until all ships are sinked
                System.out.printf("Player %d, enter hit row/column:\n", playersOrderArray[1]);
                playersRow = input.nextInt();
                playersCol = input.nextInt();
                // need to save shot into 2array -> s for 'shot'
                playersShoot2[playersRow][playersCol] = 's';

                shooting = false;
                Player2Hit:
                for (int row = 0; row < mapPlayer1.length; row++) {
                    for (int col = 0; col < mapPlayer1[row].length; col++) {
                        if ((mapPlayer1[row][col] == '@') && (playersShoot2[row][col] == 's')) {
                            mapPlayer2History[row][col] = 'X';
                            System.out.printf("%s HIT %s’s SHIP!\n", playersName[1], playersName[0]);
                            // return value back to '-' empty ..
                            playersShoot2[playersRow][playersCol] = '-';
                            printBattleShip(mapPlayer2History);
                            System.out.println("");
                            player2score++;
                            shooting = true;
                            break Player2Hit;
                        }
                    }
                }
                if (player2score == 5) break;
                if (!shooting) {
                    System.out.printf("%s MISSED!\n", playersName[1]);
                    mapPlayer2History[playersRow][playersCol] = 'O';
                    // return value back to '-' empty ..
                    playersShoot2[playersRow][playersCol] = '-';
                    printBattleShip(mapPlayer2History);
                    System.out.println("");
                }
            }
        }

        //final printout
        if (player1score > player2score) {
            System.out.printf("PLAYER %d WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n", playersOrderArray[0]);
            System.out.println("");
            System.out.println("Final boards:");
            System.out.println("");
            printBattleShip(mapPlayer1History);
            System.out.println("");
            printBattleShip(mapPlayer2History);
        }
        else {
            System.out.printf("PLAYER %d WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n", playersOrderArray[1]);
            System.out.println("");
            System.out.println("Final boards:");
            System.out.println("");
            printBattleShip(mapPlayer2History);
            System.out.println("");
            printBattleShip(mapPlayer1History);
        }
        input.close();
    }

    //Fill an 2d array with dash
    private static void fillMapDash(char[][] map) {
        for (int row = 0; row < map.length; row++ ) {
            for (int col = 0; col < map[row].length; col++) {
                map[row][col] = '-';
            }
        }
    }

    // Use this method to print game boards to the console.
    private static void printBattleShip(char[][] player) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(player[row][column] + " ");
                }
            }
            System.out.println("");
        }
    }

    // print new lines
    private static void printLines(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("");
        }
    }

    //method to evaluate input range between 0 and 4 included
    private static void validateCoordinates() {
        // TODO maybe later
    }

    // method for debugging
    private static void seeActualScore(String player, int playerScore) {
        System.out.printf("%s score = %d\n", player, playerScore);
        System.out.println("");
    }
}