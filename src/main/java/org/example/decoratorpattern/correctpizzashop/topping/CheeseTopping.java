package org.example.decoratorpattern.correctpizzashop.topping;

import org.example.decoratorpattern.correctpizzashop.pizza.PizzaImp;

public class CheeseTopping extends ToppingImp{
    public CheeseTopping(PizzaImp pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }
}
