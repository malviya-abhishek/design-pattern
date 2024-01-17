package org.example.factorypattern.abstractfactory;

import org.example.Patterns;
import org.example.factorypattern.abstractfactory.vehicle.Vehicle;
import org.example.factorypattern.abstractfactory.vehiclefactory.VehicleFactory;

public class AbstractFactoryPattern implements Patterns {
    @Override
    public void run() {
        System.out.println("---------------------- ABSTRACT FACTORY PATTERN STARTS ----------------------");
        VehicleFactoriesFactory vehicleFactoriesFactory = new VehicleFactoriesFactory();
        VehicleFactory luxuryFactory = vehicleFactoriesFactory.getVehicleFactory("LUXURY");
        Vehicle bmw = luxuryFactory.getVehicle("BMW");
        bmw.run();
        Vehicle mercedes = luxuryFactory.getVehicle("MERCEDES");
        mercedes.run();

        VehicleFactory ordinaryFactory = vehicleFactoriesFactory.getVehicleFactory("ORDINARY");
        Vehicle tata = ordinaryFactory.getVehicle("TATA");
        tata.run();
        Vehicle toyota = ordinaryFactory.getVehicle("TOYOTA");
        toyota.run();

        System.out.println("---------------------- ABSTRACT FACTORY PATTERN   ENDS ----------------------");
    }
}
