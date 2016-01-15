package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Game {

    private final PrintStream printStream;
    private Board board;


    public Game(Board board, PrintStream printStream) {
        this.board = board;
        this.printStream = printStream;
    }

    public void start() {
        board.draw();
    }

    public void promptPlayerForMovePosition(Player player) {
        String currentPlayer = "Player 1: ";

        if (player.isPlayer1() == false){
            currentPlayer = "Player 2: ";
        }
        printStream.println(currentPlayer+ "Please enter a number between 1-9 to indicate your move.");
    }
}
