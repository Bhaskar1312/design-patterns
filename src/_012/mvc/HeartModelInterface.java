package _012.mvc;

public interface HeartModelInterface {
    int getHeartRate();
    void registerBeatObserver(BeatObserver o);
    void registerBPMObserver(BPMObserver o);
    void removeObserver(BPMObserver o);

    void removeObserver(BeatObserver o);
}
