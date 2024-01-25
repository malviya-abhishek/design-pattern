package org.example.snakeandladder;

public class Dice {
    int faces = 6;
    public int roll(){
        return (int) (1 + Math.floor(Math.random()*faces));
    }
}
