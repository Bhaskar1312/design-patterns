package _002.test;

import _002.CurrentConditionsDisplay;
import _002.HeatIndexDisplay;
import _002.StatisticsDisplay;
import _002.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(37.7f, 80f, 1000f);
        weatherData.setMeasurements(18f, 20f, 960f);
        weatherData.setMeasurements(-5f, 100f, 890f);


    }
}
