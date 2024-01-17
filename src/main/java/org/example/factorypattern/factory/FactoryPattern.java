package org.example.factorypattern.factory;

import org.example.Patterns;

public class FactoryPattern implements Patterns {
    @Override
    public void run() {
        System.out.println("---------------------- FACTORY PATTERN STARTS ----------------------");
        ShapeFactory shapeFactory = new ShapeFactory();
        try {
            Shape circle = shapeFactory.getShape("CIRCLE");
            circle.draw();
            Shape square = shapeFactory.getShape("SQUARE");
            square.draw();
            Shape rectangle = shapeFactory.getShape("RECTANGLE");
            rectangle.draw();
            Shape random = shapeFactory.getShape("PENTAGON");
            random.draw();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------- FACTORY PATTERN   ENDS ----------------------");
    }
}
