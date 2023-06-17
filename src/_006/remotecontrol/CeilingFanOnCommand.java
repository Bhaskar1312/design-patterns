package _006.remotecontrol;

public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        System.out.println("Ceiling fan on");
        ceilingFan.high();
    }
}
