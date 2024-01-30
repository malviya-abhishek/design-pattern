package org.example.questions.snakeandladder;

public class Snake extends Jump{
    public Snake(int start, int end) throws Exception {
        super(start, end);
        if(end > start){
            throw new Exception("start can not be lesser than end in snake");
        }
    }
}
