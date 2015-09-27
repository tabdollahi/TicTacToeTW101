package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Board {
    private PrintStream printStream;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void draw() {
        printStream.print(
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n");
    }
}
