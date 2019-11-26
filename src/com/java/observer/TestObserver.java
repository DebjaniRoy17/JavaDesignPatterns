package com.java.observer;

public class TestObserver {

    public static void main(String[] args) {
        //create stocks
        IBMStock ibm = new IBMStock();
        AppleStock appleStock = new AppleStock();

        //create observers
        DisplayBoardObserver displayBoardObserver = new DisplayBoardObserver();
        MobileObserver mobileObserver = new MobileObserver();

        //register observers
        ibm.registerObserver(displayBoardObserver);
        appleStock.registerObserver(displayBoardObserver);

        ibm.registerObserver(mobileObserver);

        int price =100;
        ibm.updateStockPrice(price);
        appleStock.updateStockPrice(price);

    }

}
