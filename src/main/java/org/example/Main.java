package org.example;

import org.example.observerpattern.ObserverPattern;
import org.example.stategypattern.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static ArrayList<Patterns> patterns = new ArrayList<>();
    public static void main(String[] args) {
        patterns.add(new ObserverPattern());
        patterns.add(new StrategyPattern());
        patterns.forEach(Patterns::run);
    }
}