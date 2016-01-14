package com.thoughtworks.tictactoe;

public class GameRunner {
    private Player player1;
    private Board board;
    private Game game;

    public GameRunner(Game game, Player player1, Board board) {
        this.game = game;
        this.player1 = player1;
        this.board = board;
    }

    public void playRound() {
        game.promptPlayerForMovePosition(player1);
        String userInput = player1.returnMovePlacement();
        board.redraw(userInput);
    }
}
