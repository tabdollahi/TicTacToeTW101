package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Game {

    private Board board;
    private Player player;
    private Player player2;

    public Game(Board board, Player player, Player player2) {
        this.board = board;
        this.player = player;
        this.player2 = player2;
    }

    public void start() {
        board.draw();
        player.move();
        board.draw();
        player2.move();
        board.draw();
    }
}
