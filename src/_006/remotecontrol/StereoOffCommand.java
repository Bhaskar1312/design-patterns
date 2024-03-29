package _006.remotecontrol;

public class StereoOffCommand implements Command {
    private Stereo stereo;
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
