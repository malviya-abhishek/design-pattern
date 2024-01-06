package org.example.stategypattern.vehicle;

import org.example.stategypattern.drivestragery.SpecialDrive;

public class OffRoad extends Vehicle{

    public OffRoad() {
        super(new SpecialDrive());
    }
}
