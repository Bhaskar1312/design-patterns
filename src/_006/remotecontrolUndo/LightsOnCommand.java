package _006.remotecontrolUndo;

public class LightsOnCommand implements Command {
    Light light;
    public LightsOnCommand(Light light) { this.light = light; }
    public void execute() { light.on(); }

    public void undo() { light.off();}
}
