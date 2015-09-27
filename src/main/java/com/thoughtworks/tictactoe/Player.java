package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Player {
    private BufferedReader bufferedReader;
    private Board board;
    private PrintStream printStream;

    public Player(BufferedReader bufferedReader, Board board, PrintStream printStream) {
        this.bufferedReader = bufferedReader;
        this.board = board;
        this.printStream = printStream;
    }

    public void move() {
        printStream.println("Make a move dummy");
        board.update(readLine());
    }

    private String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
