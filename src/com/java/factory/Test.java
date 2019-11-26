package com.java.factory;

public class Test {

    public static void main(String[] args) {

        double a = 2.3;
        double b = 0.3;

        CalculateFactory factory = new CalculateFactory();
        CalculateInterface calInf = factory.getCalculation("add");
        calInf.calculate(a,b);

    }
}
