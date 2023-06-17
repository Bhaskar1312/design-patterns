package _006.remotecontrol;

public class NoCommand implements Command {
    public void execute() {}
}

/**
 * NoCommand is an example of null object. A null object is useful when you dont have a meaningful obj to return
 * yet u want to remove the responsibility of null handling in client
 */