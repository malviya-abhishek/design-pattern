package org.example.factorypattern.abstractfactory.vehiclefactory;

import org.example.factorypattern.abstractfactory.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String input);

}
