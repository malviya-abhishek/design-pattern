package org.example.tictactoe;

import java.util.ArrayList;

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }
    public void print(){

    }

}
