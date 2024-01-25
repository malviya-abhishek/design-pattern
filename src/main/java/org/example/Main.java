package org.example;

import org.example.chainofresponsibilitypattern.CORPattern;
import org.example.decoratorpattern.DecoratorPattern;
import org.example.factorypattern.abstractfactory.AbstractFactoryPattern;
import org.example.factorypattern.factory.FactoryPattern;
import org.example.observerpattern.ObserverPattern;
import org.example.snakeandladder.SnakeAndLadder;
import org.example.stategypattern.StrategyPattern;
import org.example.tictactoe.TicTacToe;

import java.util.ArrayList;

public class Main {
    static ArrayList<Patterns> patterns = new ArrayList<>();
    public static void main(String[] args) throws Exception {
//        patterns.add(new ObserverPattern());
//        patterns.add(new StrategyPattern());
//        patterns.add(new DecoratorPattern());
//        patterns.add(new FactoryPattern());
//        patterns.add(new AbstractFactoryPattern());
//        patterns.add(new CORPattern());
//        patterns.forEach(Patterns::run);
//        TicTacToe ticTacToe = new TicTacToe();
//        ticTacToe.run();
        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        snakeAndLadder.run();

    }
}