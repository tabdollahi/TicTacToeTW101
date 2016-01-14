package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class BoardTest {

    private PrintStream printStream;
    private Board board;
    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldPrintBoardWhenGameStarts() {
        board.draw();

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println(" | | ");
        inOrder.verify(printStream).println("-----");
        inOrder.verify(printStream).println(" | | ");
        inOrder.verify(printStream).println("-----");
        inOrder.verify(printStream).println(" | | ");
    }

    @Test
    public void shouldReDrawBoardWhenUserMakesANewMove() {
        board.redraw("1");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("X| | ");
        inOrder.verify(printStream).println("-----");
        inOrder.verify(printStream).println(" | | ");
        inOrder.verify(printStream).println("-----");
        inOrder.verify(printStream).println(" | | ");
    }
}
