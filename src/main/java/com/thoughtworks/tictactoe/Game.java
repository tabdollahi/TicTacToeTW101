package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Game {

    private final PrintStream printStream;
    private Player player1;
    private Board board;


    public Game(Board board, Player player1, PrintStream printStream) {
        this.board = board;
        this.player1 = player1;
        this.printStream = printStream;
    }

    public void start() {
        board.draw();
        promptPlayerForMovePosition(player1);
    }

    public void promptPlayerForMovePosition(Player player) {
        printStream.println("Please enter a number between 1-9 to indicate your move.");
        player.returnMovePlacement();
    }
}
