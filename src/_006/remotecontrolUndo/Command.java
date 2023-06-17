package _006.remotecontrolUndo;

public interface Command {
    void execute();
    void undo();
}
