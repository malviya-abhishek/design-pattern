package org.example.observerpattern.weatherstation.observer;

import org.example.observerpattern.weatherstation.observable.WsObservableImp;

public class TVDisplayObserver extends DisplayObserverImp {

    public TVDisplayObserver(WsObservableImp wsObservableImp) {
        super(wsObservableImp);
    }

    @Override
    public void update() {
        System.out.println("Tv display:-" + this.wsObservableImp.temp);
    }
}
