package com.java.singleton;

public class TestLogger {

    public static void main(String[] args) {
        Logger logger = Logger.getLoggerInstance();
        Logger logger2 = Logger.getLoggerInstance();

        System.out.println(logger.hashCode());
        System.out.println(logger2.hashCode());

    }
}
