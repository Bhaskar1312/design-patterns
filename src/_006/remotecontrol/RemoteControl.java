package _006.remotecontrol;


public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        // this time, remote handles 7 on, off buttons
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i=0;i< onCommands.length;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        /**
         * without NoCommand Class, we have to check for null in on, off
         * if(onCommands[slot] != null) {
         *  onCommand[slot].execute();
         *  }
         */
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n-----Remote Control-----\n");
        for(int i=0;i<onCommands.length;i++) {
            stringBuff.append("[slot "+i+"] "+onCommands[i].getClass().getSimpleName()+" "+offCommands[i].getClass().getSimpleName()+"\n");
        }
        return stringBuff.toString();
    }
}
