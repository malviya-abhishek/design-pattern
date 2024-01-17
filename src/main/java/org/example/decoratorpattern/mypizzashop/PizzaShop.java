package org.example.decoratorpattern.mypizzashop;

import org.example.decoratorpattern.mypizzashop.pizza.FarmHousePizza;
import org.example.decoratorpattern.mypizzashop.pizza.MargaritaPizza;
import org.example.decoratorpattern.mypizzashop.toppings.CheeseTopping;
import org.example.decoratorpattern.mypizzashop.toppings.TomatoTopping;

public class PizzaShop {
    public void run(){
        FarmHousePizza farmHousePizza = new FarmHousePizza();
        CheeseTopping cheeseTopping = new CheeseTopping();
        TomatoTopping tomatoTopping = new TomatoTopping();
        MargaritaPizza margaritaPizza = new MargaritaPizza();

        cheeseTopping.add(farmHousePizza);
        farmHousePizza.about();
        tomatoTopping.add(farmHousePizza);
        farmHousePizza.about();

        margaritaPizza.about();
        cheeseTopping.add(margaritaPizza);
        margaritaPizza.about();
    }
}
