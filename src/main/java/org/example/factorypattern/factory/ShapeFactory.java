package org.example.factorypattern.factory;

import org.example.factorypattern.factory.shape.Circle;
import org.example.factorypattern.factory.shape.Reactangle;
import org.example.factorypattern.factory.shape.Square;

public class ShapeFactory {
    public Shape getShape( String input) throws Exception {
        switch (input) {
            case "CIRCLE" -> {
                return new Circle();
            }
            case "SQUARE" -> {
                return new Square();
            }
            case "RECTANGLE" -> {
                return new Reactangle();
            }
            default -> {
                throw new Exception("Invalid input:- " + input);
            }
        }
    }
}
