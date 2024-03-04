package com.javaproject.TicTacToe.model;

import lombok.Data;

@Data
public class Game {

    private String gameId;
    Player player1;
    Player player2;
    private GameStatus status;
    private int [][] board;
    private TicToe winner;

}
