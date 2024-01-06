package org.example.observerpattern.weatherstation;

import org.example.observerpattern.weatherstation.observable.WsObservableImp;
import org.example.observerpattern.weatherstation.observer.MobileDIsplayObserver;
import org.example.observerpattern.weatherstation.observer.TVDisplayObserver;

public class WeatherStation {
    public void run(){
        WsObservableImp wsObservableImp = new WsObservableImp();

        TVDisplayObserver tvDisplayObserver = new TVDisplayObserver(wsObservableImp);
        MobileDIsplayObserver mobileDIsplayObserver = new MobileDIsplayObserver(wsObservableImp);

        wsObservableImp.add(tvDisplayObserver);
        wsObservableImp.add(mobileDIsplayObserver);


        wsObservableImp.setTemperature(100);
        wsObservableImp.setTemperature(200);
    }
}
