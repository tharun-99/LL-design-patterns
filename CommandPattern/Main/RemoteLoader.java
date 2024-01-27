package DesignPatterns.CommandPattern.Main;

import DesignPatterns.CommandPattern.Appliances.CeilingFan;
import DesignPatterns.CommandPattern.Appliances.GarageDoor;
import DesignPatterns.CommandPattern.Appliances.Light;
import DesignPatterns.CommandPattern.Appliances.Stereo;
import DesignPatterns.CommandPattern.Command.*;
import DesignPatterns.CommandPattern.Command.CeilingFanCommands.CeilingFanHighSpeedCommand;
import DesignPatterns.CommandPattern.Command.CeilingFanCommands.CeilingFanLowSpeedCommand;
import DesignPatterns.CommandPattern.Command.CeilingFanCommands.CeilingFanMediumSpeedCommand;
import DesignPatterns.CommandPattern.Command.CeilingFanCommands.CeilingFanOffCommand;
import DesignPatterns.CommandPattern.Command.GarageDoorCommands.GarageDoorCloseCommand;
import DesignPatterns.CommandPattern.Command.GarageDoorCommands.GarageDoorOpenCommand;
import DesignPatterns.CommandPattern.Command.GenericCommands.MacroCommand;
import DesignPatterns.CommandPattern.Command.LightCommands.LightOffCommand;
import DesignPatterns.CommandPattern.Command.LightCommands.LightOnCommand;
import DesignPatterns.CommandPattern.Command.StereoCommands.StereoOffCommand;
import DesignPatterns.CommandPattern.Command.StereoCommands.StereoOnWithCdCommand;
import DesignPatterns.CommandPattern.RemoteControl.RemoteControl;

public class RemoteLoader {
    public static void main(String[] args) {
        // create remote control
        RemoteControl remoteControl = new RemoteControl();

        // Create automation devices
        Light livingRoomlight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Main");
        Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Bedroom");

        // Create commands for devices
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomlight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomlight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanLowSpeedCommand ceilingFanLowSpeedCommand = new CeilingFanLowSpeedCommand(ceilingFan);
        CeilingFanMediumSpeedCommand ceilingFanMediumSpeedCommand = new CeilingFanMediumSpeedCommand(ceilingFan);
        CeilingFanHighSpeedCommand ceilingFanHighSpeedCommand = new CeilingFanHighSpeedCommand(ceilingFan);

        Command[] onCommands = new Command[] {lightOnCommand, kitchenLightOnCommand, stereoOnWithCdCommand,
                                            ceilingFanHighSpeedCommand};
        MacroCommand partyOnMacro = new MacroCommand(onCommands);

        Command[] offCommands = new Command[] {lightOffCommand, kitchenLightOffCommand, stereoOffCommand,
                                                ceilingFanOffCommand};
        MacroCommand partyOffMacro = new MacroCommand(offCommands);

        // assign the slots
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(3, stereoOnWithCdCommand, stereoOffCommand);
        remoteControl.setCommand(4, ceilingFanLowSpeedCommand, ceilingFanOffCommand);
        remoteControl.setCommand(5, ceilingFanHighSpeedCommand, ceilingFanOffCommand);
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);

        // printout the slots
        System.out.println(remoteControl);

        // control devices with our remote control
        remoteControl.onButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.onButtonWasPressed(5);
        remoteControl.undoButtonWasPressed();

        remoteControl.offButtonWasPressed(0);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(2);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(3);

        System.out.println("\n------------ PARTY MODE ON ------------\n");
        remoteControl.onButtonWasPressed(6);
        System.out.println("\n------------ PARTY MODE OFF ------------\n");
        remoteControl.offButtonWasPressed(6);
    }
}
