package com.java.builder;

public class RobotEngineer {

    private RobotBuilderInterface robotBuilderInterface;

    public RobotEngineer(RobotBuilderInterface robotBuilder) {
        this.robotBuilderInterface = robotBuilder;
    }

    public Robot getRobot(){
        return this.robotBuilderInterface.getRobot();
    }
    public void makeRobot(){
        this.robotBuilderInterface.buildRobotHead();
        this.robotBuilderInterface.buildRobotTorso();
        this.robotBuilderInterface.buildRobotArms();
        this.robotBuilderInterface.buildRobotLegs();
    }
}
