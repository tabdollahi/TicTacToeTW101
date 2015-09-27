package com.thoughtworks.tictactoe;


import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class ValidInputReaderTest {
    private Board board;
    private BufferedReader reader;
    private ValidInputReader validInputReader;
    private PrintStream printStream;


    @Before
    public void setUp() throws Exception {
        reader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        validInputReader = new ValidInputReader(reader, printStream, board);
    }

    @Test
    public void shouldReadLineWhenReading() throws IOException {
        when(reader.readLine()).thenReturn("result");

        assertThat(validInputReader.read(), is("result"));
    }

    @Test
    public void shouldPromptUserWhenLocationIsAlreadyTaken() {
        when(board.isLocationTaken(anyString())).thenReturn(true);

        validInputReader.read();

        verify(printStream).println(contains("already taken"));
    }

    @Test
    public void shouldNotPromptUserWhenLocationIsNotTaken() {
        when(board.isLocationTaken(anyString())).thenReturn(false);

        validInputReader.read();

        verify(printStream, never()).println(contains("already taken"));
    }

    @Test
    public void shouldPromptForNewInputWhenLocationIsTaken() {
        when(board.isLocationTaken(anyString())).thenReturn(true);

        validInputReader.read();

        verify(printStream).println("Make a move dummy");
    }

    @Test
    public void shouldNotPromptForNewInputWhenLocationIsNotTaken() {
        when(board.isLocationTaken(anyString())).thenReturn(false);

        validInputReader.read();

        verify(printStream, never()).println("Make a move dummy");
    }

//    @Test
//    public void shouldNotUpdateBoardWhenLocationIsAlreadyTaken() {
//        when(board.isLocationTaken(anyString())).thenReturn(true);
//
//        player.move();
//
//        verify(board, never()).update(anyString(), anyString());
//    }

}