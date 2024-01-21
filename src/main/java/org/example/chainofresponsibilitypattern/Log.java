package org.example.chainofresponsibilitypattern;

public class Log {
    public  static  LogProcessor Log(){
         return new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
    }
}
