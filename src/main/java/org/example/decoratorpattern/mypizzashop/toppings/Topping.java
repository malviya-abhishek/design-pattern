package org.example.decoratorpattern.mypizzashop.toppings;

import org.example.decoratorpattern.mypizzashop.pizza.PizzaImp;

public interface Topping {
    void add(PizzaImp pizza);
}
