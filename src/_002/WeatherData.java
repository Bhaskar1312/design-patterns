package _002;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers) { // we tell all observers here, we know they all implement update(), so we know how to notify them
            o.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    //other WeatherData methods here

}
