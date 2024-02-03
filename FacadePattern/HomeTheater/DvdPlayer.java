package DesignPatterns.FacadePattern.HomeTheater;

public class DvdPlayer {
    public void on() {
        System.out.println("Dvd player is on");
    }

    public void off() {
        System.out.println("Dvd player is off");
    }

    public void play(String movie) {
        System.out.println("Dvd player is playing movie : " + movie);
    }

    public void stop() {
        System.out.println("Dvd player stopped");
    }

    public void eject() {
        System.out.println("Ejecting the cd...");
    }
}
