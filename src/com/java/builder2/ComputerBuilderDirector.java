package com.java.builder2;

public class ComputerBuilderDirector {

    public Computer buildBasicComputer(){
        return new Computer.Builder("212","213").build();
    }

    public Computer buildGraphicComputer(){
        return new Computer.Builder("212","213").setGraphicCardEnabled(true).build();
    }
}
