package org.example.factorypattern.abstractfactory.vehicle;

public class Toyota implements Vehicle{

    @Override
    public void run() {
        System.out.println("Toyota");
    }
}
