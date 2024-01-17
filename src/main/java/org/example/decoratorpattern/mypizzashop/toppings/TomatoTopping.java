package org.example.decoratorpattern.mypizzashop.toppings;

import org.example.decoratorpattern.mypizzashop.pizza.PizzaImp;

public class TomatoTopping implements Topping{
    @Override
    public void add(PizzaImp pizza) {
        pizza.price += 100;
        pizza.description = pizza.description + " with tomato";
    }
}
