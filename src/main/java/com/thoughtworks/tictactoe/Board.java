package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private PrintStream printStream;
    private Map<String, String> updates;

    public Board(PrintStream printStream, Map<String, String> updates) {
        this.printStream = printStream;
        this.updates = updates;
    }

    public void draw() {
        String stringFormat =   (
                " %s | %s | %s \n" +
                        "-----------\n" +
                        " %s | %s | %s \n" +
                        "-----------\n" +
                        " %s | %s | %s \n"
        );

        String tictactoeBoard = String.format(stringFormat,
                updates.get("1"), updates.get("2"), updates.get("3"),
                updates.get("4"), updates.get("5"), updates.get("6"),
                updates.get("7"), updates.get("8"), updates.get("9")
        );

        printStream.print(tictactoeBoard);
    }

    public void update(String location, String symbol) {
        updates.put(location, symbol);
    }

    public boolean isLocationTaken(String location) {
        return false;
    }
}
