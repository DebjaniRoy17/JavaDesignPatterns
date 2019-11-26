package com.java.builder;

public class TestBuilderRobot {

    public static void main(String[] args) {

        RobotBuilderInterface robotBuilder = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();
        System.out.println("Robot HEad looks like "+firstRobot.getRobotHead());
    }
}
