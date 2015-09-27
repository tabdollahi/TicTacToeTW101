package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Game {

    private Board board;
    private PrintStream printStream;
    private Player player;

    public Game(Board board, PrintStream printStream, Player player) {
        this.board = board;
        this.printStream = printStream;
        this.player = player;
    }

    public void start() {
        board.draw();
        player.move();
        board.draw();
    }
}
