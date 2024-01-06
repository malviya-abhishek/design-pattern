package org.example.stategypattern.vehicle;

import org.example.stategypattern.drivestragery.NormalDrive;

public class Passenger extends Vehicle{
    public Passenger() {
        super(new NormalDrive());
    }
}
