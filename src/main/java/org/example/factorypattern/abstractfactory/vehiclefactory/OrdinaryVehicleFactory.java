package org.example.factorypattern.abstractfactory.vehiclefactory;

import org.example.factorypattern.abstractfactory.vehicle.Tata;
import org.example.factorypattern.abstractfactory.vehicle.Toyota;
import org.example.factorypattern.abstractfactory.vehicle.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String input) {
        switch (input){
            case "TATA" -> {
                return new Tata();
            }
            case "TOYOTA" -> {
                return new Toyota();
            }
        }
        return null;
    }
}
