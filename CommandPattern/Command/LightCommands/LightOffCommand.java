package DesignPatterns.CommandPattern.Command.LightCommands;

import DesignPatterns.CommandPattern.Appliances.Light;
import DesignPatterns.CommandPattern.Command.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
