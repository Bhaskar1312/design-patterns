package _006.remotecontrolUndo;

public class LightsOffCommand implements Command {
    Light light;
    public LightsOffCommand(Light light) { this.light = light; }
    public void execute() { light.off(); }
    public void undo() { light.on();}
}