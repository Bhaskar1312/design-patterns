package _012.mvc;

public class BeatController implements ControllerInterface { //creamy stuff of oreo, b/w model and view
    BeatModelInterface model;
    DJView view;
    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }
    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }

    @Override
    public void increaseBPMButton() {
        int bpm = model.getBPM();
        model.setBPM(bpm+1);
    }

    @Override
    public void decreaseBPMButton() {
        int bpm = model.getBPM();
        model.setBPM(bpm-1);
    }
}
