package DesignPatterns.FacadePattern.HomeTheater;

public class Amplifier {
    DvdPlayer dvdPlayer;
    int volume;

    public void on() {
        System.out.println("Amplifier turned on");
    }

    public void off() {
        System.out.println("Amplifier turned off");
    }

    public void setDvd(DvdPlayer dvd) {
        dvdPlayer = dvd;
    }

    public void setSurroundSound() {
        System.out.println("Surround sound set!");
    }

    public void setVolume(int vol) {
        this.volume = vol;
    }

}
