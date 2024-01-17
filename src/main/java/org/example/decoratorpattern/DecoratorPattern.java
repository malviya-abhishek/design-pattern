package org.example.decoratorpattern;

import org.example.Patterns;
//import org.example.decoratorpattern.mypizzashop.PizzaShop;

public class DecoratorPattern implements Patterns {

    @Override
    public void run() {
        System.out.println("---------------------- DECORATOR PATTERN STARTS ----------------------");
//        PizzaShop pizzaShop = new PizzaShop();
//        pizzaShop.run();

        org.example.decoratorpattern.correctpizzashop.PizzaShop pizzaShop = new org.example.decoratorpattern.correctpizzashop.PizzaShop();
        pizzaShop.run();
        System.out.println("---------------------- DECORATOR PATTERN   ENDS ----------------------");
    }
}
