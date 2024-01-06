package org.example.stategypattern;

import org.example.Patterns;
import org.example.stategypattern.vehicle.OffRoad;
import org.example.stategypattern.vehicle.Passenger;
import org.example.stategypattern.vehicle.Sports;
import org.example.stategypattern.vehicle.Vehicle;

import java.util.ArrayList;

public class StrategyPattern implements Patterns {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    @Override
    public void run() {
        System.out.println("---------------------- STRATEGY PATTERN STARTS ----------------------");
        vehicles.add(new OffRoad());
        vehicles.add(new Sports());
        vehicles.add(new Passenger());
        vehicles.forEach(Vehicle::drive);
        System.out.println("---------------------- STRATEGY PATTERN   ENDS ----------------------");
    }
}
