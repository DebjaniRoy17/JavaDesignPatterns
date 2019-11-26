package com.java.factory;

public class CalculateFactory {

    public CalculateInterface getCalculation(String type){
        CalculateInterface calc = null;
        if("add".equalsIgnoreCase(type)) {
            calc = new Add();
        } else if("divide".equalsIgnoreCase(type)) {
            calc = new Divide();
        }

        return  calc;
    }
}
