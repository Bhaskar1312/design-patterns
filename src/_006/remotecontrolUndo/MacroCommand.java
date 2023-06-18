package _006.remotecontrolUndo;

import _006.remotecontrol.Light;
import _006.remotecontrol.LightsOffCommand;
import _006.remotecontrol.LightsOnCommand;
import _006.remotecontrol.RemoteControl;
import _006.remotecontrol.Stereo;
import _006.remotecontrol.StereoOffCommand;
import _006.remotecontrol.StereoOnWithCDCommand;
import _006.remotecontrol.Command;

public class MacroCommand implements Command {
    Command[] commands;
    public MacroCommand(Command... commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i=0;i<commands.length;i++) {
            commands[i].execute();
        }
    }

    /**
    public void undo() {
        for(int i=commands.length-1;i>=0;i--) { // reverse
            commands[i].undo();
        }
    }
     */

    public static void main(String[] args) {
        Light light = new Light("Living room");
        Stereo stereo = new Stereo("Living room");

        LightsOnCommand lightsOn = new LightsOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

        LightsOffCommand lightsOff = new LightsOffCommand(light);
        StereoOffCommand steroOff = new StereoOffCommand(stereo);

        MacroCommand partyOnCommand = new MacroCommand(lightsOn, stereoOn); // or Command[] partyOn = new Command[] {lightsOn, stereoOn} without varargs
        MacroCommand partyOffCommand = new MacroCommand(lightsOff, steroOff);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnCommand, partyOffCommand);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro on ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing macro off ---");
        remoteControl.offButtonWasPushed(0);

    }
}
