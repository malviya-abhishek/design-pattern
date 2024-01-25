package org.example.snakeandladder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Board {
    ArrayList<Jump> board;
    ArrayList<Dice> dices = new ArrayList<>();
    LinkedList<Player> players = new LinkedList<>();
    public Board(int boardSize, int dices, int snakes, int ladders, int players) throws Exception {
        board = new ArrayList<>(Collections.nCopies(boardSize, null));
        for (int i = 0; i <dices ; i++) {
            this.dices.add(new Dice());
        }
        int snakesCount = snakes, laddersCount = ladders;
        while(snakesCount > 0  || laddersCount > 0){
            int start = (int) (Math.random() * boardSize);
            int end = (int) (Math.random() * boardSize);
            if(snakesCount > 0 && start > end){
                if(this.board.get(start) == null){
                    this.board.set(start, new Snake(start, end));
                    snakesCount--;
                }
            }
            if(laddersCount > 0 && end > start){
                if(this.board.get(start) == null){
                    this.board.set(start, new Ladder(start, end));
                    laddersCount--;
                }
            }
        }
        for (int i = 0; i < players; i++) {
            this.players.add(new Player( "Player:- " + (1+i) ));
        }
    }

     int rollDices(){
        int ans = 0;
        for (Dice dice : this.dices) {
            ans += dice.roll();
        }
        return ans;
    }

    int chainNextPosition(int start){
        Jump next = this.board.get(start);
        if(next == null){
            return start;
        }
        if(next.getClass() == Ladder.class){
            System.out.println("Got a ladder moving from " + next.getStart() + " to " + next.getEnd() );
        }
        if(next.getClass() == Snake.class){
            System.out.println("Got a snake moving from " + next.getStart() + " to " + next.getEnd() );
        }
        return chainNextPosition(next.getEnd());
    }



    public void run(){
        System.out.println("Snakes and ladders started");
        Player winner = null;
        while(winner == null){
            Player currentPlayer = this.players.getFirst();
            this.players.removeFirst();
            this.players.addLast(currentPlayer);
            int moveBy = this.rollDices();
            int nextPosition = moveBy + currentPlayer.getPosition();
            if(nextPosition >= this.board.size()){
                continue;
            }
            if(nextPosition + 1 == this.board.size()){
                winner = currentPlayer;
                break;
            }
            nextPosition = this.chainNextPosition(nextPosition);
            System.out.println(currentPlayer.getName() + " moved  from " + currentPlayer.getPosition() + " to " + nextPosition);
            currentPlayer.setPosition(nextPosition);

        }
        System.out.println("Snakes and ladders ended");
        System.out.println("and the winner is" + winner.getName());
    }
}
