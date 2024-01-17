package org.example.factorypattern.abstractfactory.vehicle;

public class BMW implements Vehicle{
    @Override
    public void run() {
        System.out.println("BMW");
    }
}
