package com.java.observer;

public class DisplayBoardObserver implements Observer {

    @Override
    public int updateStock(Stock stock) {
        System.out.println("DISPLAY BOARD : Price of "+stock.getName()+"has changed to "+stock.getPrice());
        return 1;
    }
}
