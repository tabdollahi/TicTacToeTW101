package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;

public class ValidInputReader {
    private BufferedReader bufferedReader;

    public ValidInputReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String read() {
        return readLine();
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
