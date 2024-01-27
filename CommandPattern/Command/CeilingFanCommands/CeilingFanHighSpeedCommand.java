package DesignPatterns.CommandPattern.Command.CeilingFanCommands;

import DesignPatterns.CommandPattern.Appliances.CeilingFan;
import DesignPatterns.CommandPattern.Command.Command;

public class CeilingFanHighSpeedCommand implements Command {
    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanHighSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.OFF) ceilingFan.off();
        else if(prevSpeed == CeilingFan.LOW) ceilingFan.low();
        else if(prevSpeed == CeilingFan.MEDIUM) ceilingFan.medium();
        else if(prevSpeed == CeilingFan.HIGH) ceilingFan.high();
    }
}
