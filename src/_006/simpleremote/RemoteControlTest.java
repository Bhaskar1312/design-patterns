package _006.simpleremote;

public class RemoteControlTest { // This is our client in command pattern speak
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // The remote is our invoker, it will be passed a command object that can be used to make requests
        Light light = new Light(); // This is our receiver of the request
        LightsOnCommand lightOn = new LightsOnCommand(light); // Here, create a command and pass the receiver to it

        remote.setCommand(lightOn); // Here pass the command to the invoker
        remote.buttonWasPressed(); // then simulate the button being pressed

    }
}
