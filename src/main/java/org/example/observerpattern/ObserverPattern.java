package org.example.observerpattern;

import org.example.Patterns;
import org.example.observerpattern.weatherstation.WeatherStation;

public class ObserverPattern implements Patterns {
    @Override
    public void run() {
        System.out.println("---------------------- OBSERVER PATTERN STARTS ----------------------");
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.run();
        System.out.println("---------------------- OBSERVER PATTERN   ENDS ----------------------");
    }
}
