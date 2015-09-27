package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Player {
    private ValidInputReader reader;
    private Board board;
    private PrintStream printStream;
    private String symbol;

    public Player(ValidInputReader reader, Board board, PrintStream printStream, String symbol) {
        this.reader = reader;
        this.board = board;
        this.printStream = printStream;
        this.symbol = symbol;
    }

    public void move() {
        printStream.println("Make a move dummy");
        board.update(location(), symbol);
    }

    private String location() {
        return reader.read();
    }

}
