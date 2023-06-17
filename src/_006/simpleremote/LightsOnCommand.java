package _006.simpleremote;

public class LightsOnCommand implements Command {
    Light light;

    public LightsOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

}
