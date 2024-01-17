package org.example.factorypattern.factory.shape;

import org.example.factorypattern.factory.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
