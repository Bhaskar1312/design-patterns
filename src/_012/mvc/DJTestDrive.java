package _012.mvc;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model); //pass the controller, controller creates the view

    }
}
