package com.javaproject.TicTacToe.model;

import lombok.Data;

@Data
public class GamePlay {

    private TicToe type;
    private Integer coordinateX;
    private Integer coordinateY;
    private String gameId;
}
