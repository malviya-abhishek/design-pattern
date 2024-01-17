package org.example.decoratorpattern.mypizzashop.pizza;

public class PizzaImp implements Pizza {
    public  int price;
    public  String description;

    PizzaImp(String name, int price){
        this.description = name;
        this.price = price;
    }


    @Override
    public void about() {
        System.out.println("description:-" + description);
        System.out.println("price:-" + price);
    }
}
