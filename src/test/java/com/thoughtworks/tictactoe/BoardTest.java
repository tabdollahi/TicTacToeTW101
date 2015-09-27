package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    private PrintStream printStream;
    private Board board;
    private Map<String, String> updates;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        updates = new HashMap<>();
        for (Integer i = 1; i <= 9; i++) {
            updates.put(i.toString(), " ");
        }

        board = new Board(printStream, updates);
    }

    @Test
    public void shouldPrintBoardWhenDrawn() {
        for (Integer i = 1; i <= 9; i++) {
            updates.put(i.toString(), i.toString());
        }

        board.draw();

        verify(printStream).print(
                " 1 | 2 | 3 \n" +
                "-----------\n" +
                " 4 | 5 | 6 \n" +
                "-----------\n" +
                " 7 | 8 | 9 \n");
    }


    @Test
    public void shouldMarkTopLeftCornerWhenUpdatingLocationOne() {
        board.update("1");

        assertThat(updates.get("1"), is("X"));
    }

    @Test
    public void shouldMarkTopCenterWhenUpdatingLocationTwo() {
        board.update("2");

        assertThat(updates.get("2"), is("X"));
    }

}