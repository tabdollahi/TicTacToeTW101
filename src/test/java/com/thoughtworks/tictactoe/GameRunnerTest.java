package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameRunnerTest {

    Game game;
    GameRunner gameRunner;
    Board board;
    Player player1;

    @Before
    public void setUp() {
        game = mock(Game.class);
        player1 = mock(Player.class);
        board = mock(Board.class);
        gameRunner = new GameRunner(game, player1, board);
    }

    @Test
    public void shouldPromptPlayer1ForMoveWhenPlayingRound() {
        gameRunner.playRound();
        verify(game).promptPlayerForMovePosition(player1);
    }

    @Test
    public void shouldGetUserInputFromPlayer1WhenPlayingRound() {
        gameRunner.playRound();
        verify(player1).returnMovePlacement();
    }

    @Test
    public void shouldRedrawBoardWithPlayer1InputWhenPlayingRound() {
        when(player1.returnMovePlacement()).thenReturn("3");
        gameRunner.playRound();

        String userInput = player1.returnMovePlacement();
        verify(board).redraw(userInput);
    }
}
