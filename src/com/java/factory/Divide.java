package com.java.factory;

public class Divide implements CalculateInterface{

    public void calculate(double a, double b){
        System.out.println("a/b: "+a/b);
    }
}
