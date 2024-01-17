package org.example.decoratorpattern.mypizzashop.toppings;

import org.example.decoratorpattern.mypizzashop.pizza.PizzaImp;

public class CheeseTopping implements Topping{
    @Override
    public void add(PizzaImp pizza) {
        pizza.price += 200;
        pizza.description = pizza.description + " with cheese";
    }
}
