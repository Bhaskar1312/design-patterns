package _006.simpleremote;

public class GarageDoorTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand command = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(command);

        remote.buttonWasPressed();
    }
}
