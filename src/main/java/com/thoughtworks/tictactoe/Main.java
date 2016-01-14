package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Player player1 = new Player(bufferedReader, true);
        Game game = new Game(board, player1, System.out);
        GameRunner gameRunner = new GameRunner(game, player1, board);

        game.start();
        gameRunner.playRound();

    }
}
