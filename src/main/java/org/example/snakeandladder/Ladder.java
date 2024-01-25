package org.example.snakeandladder;

public class Ladder extends Jump{
    public Ladder(int start, int end) throws Exception {
        super(start, end);
        if (start > end) {
            throw new Exception("start can not be greater than end in ladder");
        }
    }
}
