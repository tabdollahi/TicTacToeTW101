package com.thoughtworks.tictactoe;

public class GameRunner {
    private Player player2;
    private Player player1;
    private Board board;
    private Game game;

    public GameRunner(Game game, Player player1, Board board, Player player2) {
        this.game = game;
        this.player1 = player1;
        this.board = board;
        this.player2 = player2;
    }

    public void playRound() {
        game.promptPlayerForMovePosition(player1);
        String userInput1 = player1.returnMovePlacement();
        board.redraw(userInput1);
        game.promptPlayerForMovePosition(player2);
        String userInput2 = player2.returnMovePlacement();
        board.redraw(userInput2);
    }
}
