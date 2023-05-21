package com.bogdancode.weather_station;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {

    private float temperature;
    private float humidity;


    public CurrentConditionsDisplay() {
    }

    public void update(float newTemperature, float newHumidity) {
        this.temperature = newTemperature;
        this.humidity = newHumidity;
        display();
    }


    public void propertyChange(PropertyChangeEvent event) {
        String propertyName = event.getPropertyName();
        if ("weatherData".equals(propertyName)) {
            WeatherData weatherData = (WeatherData) event.getNewValue();
            float newTemperature = weatherData.getTemperature();
            float newHumidity = weatherData.getHumidity();
            update(newTemperature, newHumidity);
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " +
                humidity + "% humidity");
    }
}
