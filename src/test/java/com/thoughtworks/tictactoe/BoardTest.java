package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    @Test
    public void shouldPrintBoardWhenDrawn() {
        PrintStream printStream = mock(PrintStream.class);
        new Board(printStream).draw();

        verify(printStream).print(
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n");
    }

}