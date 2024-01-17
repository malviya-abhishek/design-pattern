package org.example.factorypattern.factory.shape;

import org.example.factorypattern.factory.Shape;

public class Reactangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
