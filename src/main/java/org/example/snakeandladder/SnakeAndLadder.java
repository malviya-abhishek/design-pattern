package org.example.snakeandladder;


/**
 * Board ->
 *      has a -> snakes and ladders
 *            -> Players
 *            -> dice
 */


public class SnakeAndLadder {
    Board board;
    public SnakeAndLadder() throws Exception {
        System.out.println("Game initializing ");
        this.board = new Board(100, 1, 5, 5, 3);
        System.out.println("Ready to play");
    }
    public void run(){
        this.board.run();
    }
}
