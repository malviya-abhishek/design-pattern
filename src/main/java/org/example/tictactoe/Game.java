package org.example.tictactoe;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Deque<Player> players;
    Board board;

    public void initialzeGame(){
        players = new LinkedList<>();
        Player player1 = new Player("Player1", new PlayingPieceX());
        Player player2 = new Player("Player2", new PlayingPieceO());
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while (noWinner){
            Player playerTurn = players.removeFirst();
            board.print();
            players.addLast(playerTurn);
        }
        return null;
    }


}
