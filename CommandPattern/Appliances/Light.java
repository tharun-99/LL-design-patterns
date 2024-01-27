package DesignPatterns.CommandPattern.Appliances;

public class Light {
    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light turned on");
    }

    public void off() {
        System.out.println(name + " light turned off");
    }
}
