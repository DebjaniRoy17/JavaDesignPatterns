package com.java.state;

public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine(){
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
       // hasCorrectPin = new HasPin(this);
        //atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if(cashInMachine < 0)
            atmState = atmOutOfMoney;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }
    public void insertCard(){
        atmState.insertCard();
    }
    public void ejectCard(){
        atmState.ejectCard();
    }
    public void insertPin(int pinEntered){
        atmState.insertPin(pinEntered);
    }
    public void requestCash(int cashToWithdraw){
        atmState.requestCash(cashToWithdraw);
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public ATMState getAtmOutOfMoney() {
        return atmOutOfMoney;
    }
}
