package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Player {
    private BufferedReader bufferedReader;
    private Board board;
    private PrintStream printStream;
    private String symbol;

    public Player(BufferedReader bufferedReader, Board board, PrintStream printStream, String symbol) {
        this.bufferedReader = bufferedReader;
        this.board = board;
        this.printStream = printStream;
        this.symbol = symbol;
    }

    public void move() {
        printStream.println("Make a move dummy");
        String location = getEmptyLocation();
        if (board.isLocationTaken(location)){
            printStream.println("already taken");
        } else {
            board.update(location, symbol);
        }
    }

    private String getEmptyLocation() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
