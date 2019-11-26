package com.java.observer;

public class MobileObserver implements Observer{

    @Override
    public int updateStock(Stock stock) {
        System.out.println("MOBILE : Price of "+stock.getName()+"has changed to "+stock.getPrice());
        return 1;
    }
}
