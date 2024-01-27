package DesignPatterns.CommandPattern.Appliances;

public class GarageDoor {
    private final String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " garage door is open");
        lightOn();
    }

    public void down() {
        System.out.println(name + " garage door is closed");
        lightOff();
    }

    public void stop() {}

    public void lightOn() {
        System.out.println(name + " garage lights are on");
    }

    public void lightOff() {
        System.out.println(name + " garage lights are off");
    }
}
