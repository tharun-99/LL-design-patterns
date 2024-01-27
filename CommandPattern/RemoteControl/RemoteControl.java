package DesignPatterns.CommandPattern.RemoteControl;

import DesignPatterns.CommandPattern.Command.Command;
import DesignPatterns.CommandPattern.Command.GenericCommands.NoCommand;

public class RemoteControl {
    Command[] onCommands = new Command[7];
    Command[] offCommands = new Command[7];
    Command undo;

    public RemoteControl() {
        Command noCommand = new NoCommand();

        // initialize all slots with no command
        // this way we can avoid null check while calling execute()
        for(int i=0; i<7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undo = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undo = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undo = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undo.undo();
    }

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] \t" + onCommands[i].getClass().getName()
                    + " \t \t" + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
