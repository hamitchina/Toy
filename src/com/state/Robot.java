package com.state;

/**
 * Created by Yelena_Khamitchina on 24.11.2016.
 */
public class Robot extends MechanicalToy {
    private RobotType type;
    private String robotName;
    private String color;
    private boolean hasLight;
    private int size;

    public Robot() {}

    public Robot(RobotType type, String robotName, String color, boolean hasLight, int size) {
        this.type = type;
        this.robotName = robotName;
        this.color = color;
        this.hasLight = hasLight;
        this.size = size;
    }

    public RobotType getType() {
        return type;
    }

    public void setType(RobotType type) {
        this.type = type;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasLight() {
        return hasLight;
    }

    public void setHasLight(boolean hasLight) {
        this.hasLight = hasLight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public void move() {
        super.move();
    }
}
