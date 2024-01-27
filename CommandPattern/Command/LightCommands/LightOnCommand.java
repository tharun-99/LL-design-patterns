package DesignPatterns.CommandPattern.Command.LightCommands;

import DesignPatterns.CommandPattern.Appliances.Light;
import DesignPatterns.CommandPattern.Command.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
