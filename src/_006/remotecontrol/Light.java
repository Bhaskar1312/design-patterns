package _006.remotecontrol;

import javax.swing.text.html.HTMLDocument;

public class Light {
    private String location;
    public Light(String location) {
        this.location = location;
    }

    public void off() {
        System.out.println(location+" Light off");
    }
    public void on() {
        System.out.println(location+" Light on");
    }
}
