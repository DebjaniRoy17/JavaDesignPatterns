package com.java.observer;

public interface Subject {

    void registerObserver(Observer observer);
    void notifyObservers();
    void deleteObservers(Observer observer);
}
