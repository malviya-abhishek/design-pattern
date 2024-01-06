package org.example.observerpattern.weatherstation.observable;

import org.example.observerpattern.weatherstation.observable.WsObservable;
import org.example.observerpattern.weatherstation.observer.DisplayObserver;

import java.util.ArrayList;

public class WsObservableImp implements WsObservable {
    ArrayList<DisplayObserver> displayObservers = new ArrayList<>();
    public int temp;
    @Override
    public void add(DisplayObserver displayObserver) {
        this.displayObservers.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserver displayObserver) {
        this.displayObservers.remove(displayObserver);
    }

    @Override
    public void notice() {
        this.displayObservers.forEach(DisplayObserver::update);
    }

    @Override
    public void setTemperature(int temp) {
        this.temp = temp;
        this.notice();
    }
}
