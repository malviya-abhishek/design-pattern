package org.example.stategypattern.vehicle;

import org.example.stategypattern.drivestragery.SpecialDrive;

public class Sports extends  Vehicle{

    public Sports() {
        super(new SpecialDrive());
    }
}
