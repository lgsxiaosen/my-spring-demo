package com.github.lgsxiaosen.po;

/**
 * @author sen
 * 2020/2/26 08:39
 */
public class Car {

    private String type;

    private String color;

    private int speed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
