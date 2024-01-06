package org.example.observerpattern.weatherstation.observer;

import org.example.observerpattern.weatherstation.observable.WsObservableImp;

public class MobileDIsplayObserver extends DisplayObserverImp {
    public MobileDIsplayObserver(WsObservableImp wsObservableImp) {
        super(wsObservableImp);
    }
    @Override
    public void update() {
        System.out.println("Mobile display:- " + this.wsObservableImp.temp);
    }
}
