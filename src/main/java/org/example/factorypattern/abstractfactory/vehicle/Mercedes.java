package org.example.factorypattern.abstractfactory.vehicle;

public class Mercedes implements Vehicle{
    @Override
    public void run() {
        System.out.println("Mercedes");
    }
}
