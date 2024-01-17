package org.example;

import org.example.decoratorpattern.DecoratorPattern;
import org.example.factorypattern.abstractfactory.AbstractFactoryPattern;
import org.example.factorypattern.factory.FactoryPattern;
import org.example.observerpattern.ObserverPattern;
import org.example.stategypattern.StrategyPattern;

import java.util.ArrayList;

public class Main {
    static ArrayList<Patterns> patterns = new ArrayList<>();
    public static void main(String[] args) {
//        patterns.add(new ObserverPattern());
//        patterns.add(new StrategyPattern());
//        patterns.add(new DecoratorPattern());
//        patterns.add(new FactoryPattern());
        patterns.add(new AbstractFactoryPattern());
        patterns.forEach(Patterns::run);

    }
}