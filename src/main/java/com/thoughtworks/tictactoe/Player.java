package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;

public class Player {
    private BufferedReader bufferedReader;

    public Player(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String returnMovePlacement() {
        String userInput = "";
        try {
            userInput = bufferedReader.readLine();
        } catch (IOException e) {}
        return userInput;
    }
}
