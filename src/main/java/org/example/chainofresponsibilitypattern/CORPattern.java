package org.example.chainofresponsibilitypattern;

import org.example.Patterns;



public class CORPattern implements Patterns {
    @Override
    public void run() {
        LogProcessor logger = Log.Log();
        logger.log(LogProcessor.INFO, "Hello info");
        logger.log(LogProcessor.ERROR, "Hello error");
        logger.log(LogProcessor.DEBUG, "Hello debug");
        logger.log(4, "Hello debug");
    }
}
