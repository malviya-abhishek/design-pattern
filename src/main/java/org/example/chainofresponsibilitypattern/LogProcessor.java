package org.example.chainofresponsibilitypattern;

 public abstract class LogProcessor {
    public static int INFO = 1;
     public static int DEBUG = 2;
     public static int ERROR = 3;
    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }


    protected void log(int logLevel, String message) {
        if(nextLogProcessor != null){
            nextLogProcessor.log(logLevel, message);
        }
        else{
            System.out.println("invalid log level: " + logLevel);
        }
    }
}
