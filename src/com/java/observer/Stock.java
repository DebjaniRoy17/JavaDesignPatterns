package com.java.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stock implements Subject {

    private List<Observer> observers;
    private String name;
    private int price;


    public Stock() {
        this.observers = new ArrayList<Observer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void updateStockPrice(int updatedPrice){
        this.price = updatedPrice;
        this.notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
       if(observer != null) observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while(it.hasNext()){
            Observer observer = it.next();
            observer.update(this);
        }

    }

    @Override
    public void deleteObservers(Observer observer) {
        if(observer != null) observers.remove(observer);
    }
}
