package DesignPatterns.FacadePattern.TestDrive;

import DesignPatterns.FacadePattern.HomeTheaterFacade.HomeTheaterFacade;
import DesignPatterns.FacadePattern.HomeTheater.*;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Lights lights = new Lights();
        Popper popper = new Popper();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, dvd, projector, lights, screen, popper);
        System.out.println("--------------WATCH MOVIE---------------");
        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println("--------------END MOVIE---------------");
        homeTheater.endMovie();
    }
}
