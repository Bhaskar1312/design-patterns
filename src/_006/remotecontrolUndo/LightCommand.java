package _006.remotecontrolUndo;

public class LightCommand implements Command {
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off(); // execute turns light on, so undo turns light off
    }
}
