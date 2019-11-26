package com.java.singleton;

public class Logger {

    private static Logger logger;

    private Logger(){

    }

    public static Logger getLoggerInstance(){
        if(logger == null) logger = new Logger();
        return logger;
    }
}
