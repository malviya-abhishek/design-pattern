package org.example.stategypattern.drivestragery;

public class SpecialDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Special drive strategy");
    }
}
