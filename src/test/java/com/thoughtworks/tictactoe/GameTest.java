package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {
    PrintStream printStream;
    Board board;
    Player player1;
    Game game;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        player1 = mock(Player.class);
        game = new Game(board, player1, printStream);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts() {
        game.start();

        verify(board).draw();
    }

    @Test
    public void shouldAskForNumberBetween1And9WhenPromptingPlayer() {
        game.promptPlayerForMovePosition(player1);

        verify(printStream).println(contains("Please enter a number between 1-9 to indicate your move."));
    }
}
