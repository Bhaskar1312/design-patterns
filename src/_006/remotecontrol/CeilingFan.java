package _006.remotecontrol;

public class CeilingFan {
    String location = "";
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
        System.out.println(location+" ceiling fan level is high "+level);
    }

    public void medium() {
        level = MEDIUM;
        System.out.println(location+" ceiling fan level is medium");
    }
    public void low() {
        level = LOW;
        System.out.println(location+" ceiling fan level is low");
    }

    public void off() {
        level = 0;
        System.out.println(location+" ceiling fan is off");
    }

    public int getSpeed() {
        return level;
    }
}
