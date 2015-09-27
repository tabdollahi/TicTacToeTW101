package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        game().start();
    }

    private static Game game() {
        PrintStream out = System.out;
        Board board = new Board(out, updates());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Player player = new Player(bufferedReader, board, out, "X");
        Player player2 = new Player(bufferedReader, board, out, "O");
        return new Game(board, player, player2);
    }

    private static Map<String, String> updates() {
        Map<String, String> updates = new HashMap<>();
        for (Integer i = 1; i <= 9; i++) {
            updates.put(i.toString(), " ");
        }
        return updates;
    }
}
