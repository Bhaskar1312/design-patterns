package _002;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers();

    void removeObserver(Observer o);
}
