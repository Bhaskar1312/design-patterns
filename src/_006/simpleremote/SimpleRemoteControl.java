package _006.simpleremote;

public class SimpleRemoteControl { // remote with only one slot for our light
    Command slot;
    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
