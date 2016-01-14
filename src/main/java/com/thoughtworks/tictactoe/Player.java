package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;

public class Player {
    private BufferedReader bufferedReader;
    private boolean player1Status;

    public Player(BufferedReader bufferedReader, boolean player1Status) {

        this.bufferedReader = bufferedReader;
        this.player1Status = player1Status;
    }

    public String returnMovePlacement() {
        String userInput = "";
        try {
            userInput = bufferedReader.readLine();
        } catch (IOException e) {}
        return userInput;
    }

    public boolean isPlayer1() {
        return player1Status;
    }
}
