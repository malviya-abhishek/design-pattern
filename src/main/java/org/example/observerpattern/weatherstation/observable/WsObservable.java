package org.example.observerpattern.weatherstation.observable;

import org.example.observerpattern.weatherstation.observer.DisplayObserver;

public interface WsObservable {
    void add(DisplayObserver displayObserver);
    void remove(DisplayObserver displayObserver);
    void notice();
    void setTemperature(int temp);

}
