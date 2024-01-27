package DesignPatterns.CommandPattern.Appliances;

public class CeilingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    public int speed;
    public String name;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void off() {
        speed = OFF;
        System.out.println(name + " ceiling fan is off");
    }

    public void low() {
        speed = LOW;
        System.out.println(name + " ceiling fan is set to low");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(name + " ceiling fan is set to medium");
    }

    public void high() {
        speed = HIGH;
        System.out.println(name + " ceiling fan is high");
    }

    public int getSpeed() {
        return speed;
    }
}
