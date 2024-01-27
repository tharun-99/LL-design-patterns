package DesignPatterns.CommandPattern.Command.GenericCommands;

import DesignPatterns.CommandPattern.Command.Command;

public class NoCommand implements Command {

    @Override
    public void execute() { }

    @Override
    public void undo() { }
}
