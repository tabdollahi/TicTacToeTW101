package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Board {

    private PrintStream printStream;
    private char[][] board = new char [3][3];

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        initialBoardSetup();
    }

    public void draw() {
        printStream.println(board[0][0]+ "|" + board[0][1] + "|" + board[0][2]);
        printStream.println("-----");
        printStream.println(board[1][0]+ "|" + board[1][1] + "|" + board[1][2]);
        printStream.println("-----");
        printStream.println(board[2][0]+ "|" + board[2][1] + "|" + board[2][2]);
        printStream.println();

    }

    public void redraw(String playerMoveSelection) {
        char marker = 'X';
        if (playerMoveSelection.equals("1")) {
            board[0][0] = marker;

        } else if (playerMoveSelection.equals("2")) {
            board[0][1] = marker;

            board[0][2] = marker;

        } else if (playerMoveSelection.equals("3")) {
            board[0][2] = marker;

        } else if (playerMoveSelection.equals("4")) {
            board[1][0] = marker;

        } else if (playerMoveSelection.equals("5")) {
            board[1][1] = marker;

        } else if (playerMoveSelection.equals("6")) {
            board[1][2] = marker;

        } else if (playerMoveSelection.equals("7")) {
            board[2][0] = marker;

        } else if (playerMoveSelection.equals("8")) {
            board[2][1] = marker;

        } else if (playerMoveSelection.equals("9")) {
            board[2][2] = marker;
        }
        draw();
    }

    private void initialBoardSetup(){
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j <3; j++)
            {
                board[i][j] = ' ';
            }
        }
    }
}
