package com.java.builder;

public class OldRobotBuilder implements RobotBuilderInterface {
    /**
     * Every time we want to build a new Robot, we have to create  anew class Similar to OldRobotBuilder.
     */

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin HEad");

    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");

    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Tin arms");

    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Tin Legs");

    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
