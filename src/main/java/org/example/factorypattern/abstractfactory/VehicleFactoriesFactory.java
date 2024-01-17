package org.example.factorypattern.abstractfactory;

import org.example.factorypattern.abstractfactory.vehiclefactory.LuxuryVehicleFactory;
import org.example.factorypattern.abstractfactory.vehiclefactory.OrdinaryVehicleFactory;
import org.example.factorypattern.abstractfactory.vehiclefactory.VehicleFactory;

public class VehicleFactoriesFactory {
    public VehicleFactory getVehicleFactory(String input){
        switch (input){
            case "LUXURY" -> {
                return new LuxuryVehicleFactory();
            }
            case "ORDINARY" -> {
                return new OrdinaryVehicleFactory();
            }
        }
        return null;
    }
}
