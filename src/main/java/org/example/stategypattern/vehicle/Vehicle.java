package org.example.stategypattern.vehicle;

import org.example.stategypattern.drivestragery.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public  void drive(){
        this.driveStrategy.drive();
    }
}
