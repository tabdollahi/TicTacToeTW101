package com.thoughtworks.tictactoe;

public class Game {

    private Board board;
    private Player player1;
    private Player player2;

    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        board.draw();
        player1.move();
        board.draw();
        player2.move();
        board.draw();
    }
}
