package DesignPatterns.FacadePattern.HomeTheater;

public class Lights {
    public void on() {
        System.out.println("Lights turned on");
    }

    public void off() {
        System.out.println("Lights turned off");
    }

    public void dim(int level) {
        System.out.println("Lights brightness set to : " + level);
    }
}
