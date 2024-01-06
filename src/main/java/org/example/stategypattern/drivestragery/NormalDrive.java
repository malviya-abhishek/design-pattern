package org.example.stategypattern.drivestragery;

public class NormalDrive implements  DriveStrategy{


    @Override
    public void drive() {
        System.out.println("Normal drive strategy");
    }
}
