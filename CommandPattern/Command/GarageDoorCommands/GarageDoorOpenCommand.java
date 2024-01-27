package DesignPatterns.CommandPattern.Command.GarageDoorCommands;

import DesignPatterns.CommandPattern.Appliances.GarageDoor;
import DesignPatterns.CommandPattern.Command.Command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
