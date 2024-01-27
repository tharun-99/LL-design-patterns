package DesignPatterns.CommandPattern.Appliances;

public class Stereo {
    private final String name;
    int volume;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }

    public void setCD() {
        System.out.println(name + " stereo CD is set");
    }

    public void setDVD() {
        System.out.println(name + " stereo DVD is set");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(name + " stereo volume set to " + volume);
    }

    public void setRadio() {
        System.out.println(name + " stereo is set as radio");
    }
}
