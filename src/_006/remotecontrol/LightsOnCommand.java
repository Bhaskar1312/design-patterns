package _006.remotecontrol;


public class LightsOnCommand implements Command {
    Light light;
    public LightsOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
