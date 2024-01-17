package org.example.decoratorpattern.correctpizzashop.topping;

import org.example.decoratorpattern.correctpizzashop.pizza.PizzaImp;

public abstract class ToppingImp extends PizzaImp {
    PizzaImp pizza;
    ToppingImp(PizzaImp pizza){
        this.pizza = pizza;
    }
}
