package org.example.decoratorpattern.correctpizzashop;

import org.example.decoratorpattern.correctpizzashop.pizza.FarmhousePizza;
import org.example.decoratorpattern.correctpizzashop.pizza.PizzaImp;
import org.example.decoratorpattern.correctpizzashop.topping.CheeseTopping;

public class PizzaShop {
    public void run(){
        FarmhousePizza farmhousePizza = new FarmhousePizza();
        PizzaImp farmhousePizzaWithCheese = new CheeseTopping(farmhousePizza);
        System.out.println("farmhousePizzaWithCheese cost:-" + farmhousePizzaWithCheese.cost());
    }
}
