package com.java.state;

public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than 1 card");
    }

    @Override
    public void ejectCard() {
        System.out.println("card ejected");
        atmMachine.setAtmState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int pinEntered) {
        if(pinEntered == 1234){
            System.out.println("Correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasCorrectPin());
        }else{
            System.out.println("Wrong PIN");
            atmMachine.correctPinEntered = false;
            System.out.println("Card ejected");
            atmMachine.setAtmState(atmMachine.getNoCard());
        }

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter Pin first");

    }
}
