package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream out = System.out;
        Board board = new Board(out);
        Game game = new Game(board);

        game.start();
    }
}
