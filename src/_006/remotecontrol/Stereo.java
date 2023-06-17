package _006.remotecontrol;

public class Stereo {
    private String location;
    public Stereo(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println("Setting stereo on");
    }

    public void off() {
        System.out.println("Setting stereo off");
    }

    public void setDvd(){
        System.out.println("Setting dvd");
    }

    public void setRadio(){
        System.out.println("Setting radio");
    }

    public void setVolume(int volume){
        System.out.println("Setting volume to "+volume);
    };
}
