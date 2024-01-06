package org.example.observerpattern.weatherstation.observer;

import org.example.observerpattern.weatherstation.observable.WsObservableImp;

abstract public class DisplayObserverImp implements DisplayObserver {
    WsObservableImp wsObservableImp;
    public DisplayObserverImp(WsObservableImp wsObservableImp){
        this.wsObservableImp = wsObservableImp;
    }
}
