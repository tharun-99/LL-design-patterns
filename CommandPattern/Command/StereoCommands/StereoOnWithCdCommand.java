package DesignPatterns.CommandPattern.Command.StereoCommands;

import DesignPatterns.CommandPattern.Appliances.Stereo;
import DesignPatterns.CommandPattern.Command.Command;

public class StereoOnWithCdCommand implements Command {
    Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(12);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
