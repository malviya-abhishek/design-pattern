package org.example.factorypattern.abstractfactory.vehiclefactory;

import org.example.factorypattern.abstractfactory.vehicle.BMW;
import org.example.factorypattern.abstractfactory.vehicle.Mercedes;
import org.example.factorypattern.abstractfactory.vehicle.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {
        switch (input){
            case "BMW"->{
                return new BMW();
            }
            case "MERCEDES"->{
                return new Mercedes();
            }
        }
        return null;
    }
}
