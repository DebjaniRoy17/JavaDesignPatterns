package com.java.builder2;

public class TestComputer {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder("212","213").build();
        Computer computer1 = new Computer.Builder("212","213").setGraphicCardEnabled(true).build();
    }
}
