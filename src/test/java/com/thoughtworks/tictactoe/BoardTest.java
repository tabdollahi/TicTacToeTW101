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

        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
    }

    @Test
    public void shouldDrawXInUpperLeftCornerIfPlayer1SelectionIs1() {
        board.redraw("1");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("X |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
    }

    @Test
    public void shouldDrawXInUpperMiddleIfPlayer1SelectionIs2() {
        board.redraw("2");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("  |X |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
    }

    @Test
    public void shouldDrawXInUpperRightIfPlayer1SelectionIs3() {
        board.redraw("3");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("  |  |X ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
    }

    @Test
    public void shouldDrawXInMiddleLeftIfPlayer1SelectionIs4() {
        board.redraw("4");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("X |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
    }

    @Test
    public void shouldDrawXInCenterIfPlayer1SelectionIs5() {
        board.redraw("5");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |X |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
    }

    @Test
    public void shouldDrawXInMiddleRightIfPlayer1SelectionIs6() {
        board.redraw("6");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |X ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
    }

    @Test
    public void shouldDrawXInBottomLeftIfPlayer1SelectionIs7() {
        board.redraw("7");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("X |  |  ");
    }

    @Test
    public void shouldDrawXInBottomMiddleIfPlayer1SelectionIs8() {
        board.redraw("8");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |X |  ");
    }

    @Test
    public void shouldDrawXInBottomRightIfPlayer1SelectionIs9() {
        board.redraw("9");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |X ");
    }

    @Test
    public void shouldDrawOInUpperLeftCornerIfPlayer2SelectionIs1() {
        board.redraw("1");

        InOrder inOrder = Mockito.inOrder(printStream);

        inOrder.verify(printStream).println(" O|  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
        inOrder.verify(printStream).println("--------");
        inOrder.verify(printStream).println("  |  |  ");
    }
}
