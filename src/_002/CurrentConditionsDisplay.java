package _002;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        // The constructor is passed the weatherData object(the subject) and we use it to register the display as an observer
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    // @Override
    // public void update(float temperature, float humidity, float pressure) {
    //     this.temperature = temperature;
    //     this.humidity = humidity;
    //     display();
    // }

    @Override
    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature
        +" C degrees and "+ humidity + " humidity");
    }
}
