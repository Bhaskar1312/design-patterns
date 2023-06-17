package _006.remotecontrolUndo;

import _006.remotecontrol.NoCommand;
import _006.remotecontrol.RemoteControl;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand; // stash the last command here

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        class NoCommand implements Command{
            public void execute() {}
            public void undo() {}
        }
        for(int i=0;i<7;i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
       undoCommand = new NoCommand(); // Null object check avoiding
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-----Remote Control-----\n");
        for(int i=0;i<onCommands.length;i++) {
            sb.append("[slot "+i+"] "+onCommands[i].getClass().getSimpleName()+" "+offCommands[i].getClass().getSimpleName()+"\n");
        }
        sb.append('\n');
        return sb.toString();
    }
}
