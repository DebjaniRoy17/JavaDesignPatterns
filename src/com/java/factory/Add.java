package com.java.factory;

public class Add implements CalculateInterface{

    public void calculate(double a, double b){
        System.out.println("a+b: "+(a+b));
    }
}
