package DesignPatterns.CommandPattern.Command.CeilingFanCommands;

import DesignPatterns.CommandPattern.Appliances.CeilingFan;
import DesignPatterns.CommandPattern.Command.Command;

public class CeilingFanLowSpeedCommand implements Command {
    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanLowSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.OFF) ceilingFan.off();
        else if(prevSpeed == CeilingFan.LOW) ceilingFan.low();
        else if(prevSpeed == CeilingFan.MEDIUM) ceilingFan.medium();
        else if(prevSpeed == CeilingFan.HIGH) ceilingFan.high();
    }
}
