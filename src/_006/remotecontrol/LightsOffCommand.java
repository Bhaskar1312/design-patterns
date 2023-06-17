package _006.remotecontrol;


public class LightsOffCommand implements Command {
    Light light;
    public LightsOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
