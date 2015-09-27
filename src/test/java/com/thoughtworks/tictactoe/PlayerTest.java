package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class PlayerTest {

    private static final String A_STRING = "AnyString";
    private static final String A_DIFFERENT_STRING = "ADifferentString";
    private BufferedReader bufferedReader;
    private Board board;
    private Player player;
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        printStream = mock(PrintStream.class);
        player = new Player(bufferedReader, board, printStream, "X");
    }

    @Test
    public void shouldUpdateBoardWhenEnteringMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn(A_STRING);

        player.move();

        verify(board).update(A_STRING, "X");
    }

    @Test
    public void shouldUpdateBoardWhenEnteringADifferentMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn(A_DIFFERENT_STRING);

        player.move();

        verify(board).update(A_DIFFERENT_STRING, "X");
    }

    @Test
    public void shouldPromptPlayerWhenMoving() {
        player.move();

        verify(printStream).println("Make a move dummy");
    }


    @Test
    public void shouldUpdateBoardWithXWhenMySymbolIsX() throws IOException {
        when(bufferedReader.readLine()).thenReturn(A_STRING);
        player = new Player(bufferedReader, board, printStream, "@");

        player.move();

        verify(board).update(A_STRING, "@");
    }


    @Test
    public void shouldPromptUserWhenLocationIsAlreadyTaken() {
        when(board.isLocationTaken(anyString())).thenReturn(true);

        player.move();

        verify(printStream).println(contains("already taken"));
    }

    @Test
    public void shouldNotUpdateBoardWhenLocationIsAlreadyTaken() {
        when(board.isLocationTaken(anyString())).thenReturn(true);

        player.move();

        verify(board, never()).update(anyString(), anyString());
    }

}