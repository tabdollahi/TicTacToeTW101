package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class ValidInputReader {
    private BufferedReader bufferedReader;
    private final PrintStream printStream;
    private Board board;

    public ValidInputReader(BufferedReader bufferedReader, PrintStream printStream, Board board) {
        this.bufferedReader = bufferedReader;
        this.printStream = printStream;
        this.board = board;
    }

    public String read() {
        String input = readLine();
        if (board.isLocationTaken(input)){
            printStream.println("already taken");
            printStream.println("Make a move dummy");
        }
        return input;
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
