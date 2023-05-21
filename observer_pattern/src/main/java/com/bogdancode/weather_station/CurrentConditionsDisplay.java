package com.bogdancode.weather_station;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {

    private float temperature;
    private float humidity;


    public CurrentConditionsDisplay() {
    }

    public void updateTemperature(float newTemperature) {
        temperature = newTemperature;
        display();
    }

    public void updateHumidity(float newHumidity) {
        humidity = newHumidity;
        display();
    }

    public void propertyChange(PropertyChangeEvent event) {
        String propertyName = event.getPropertyName();
        if ("temperature".equals(propertyName)) {
            float newTemperature = (float) event.getNewValue();
            updateTemperature(newTemperature);
        } else if ("humidity".equals(propertyName)) {
            float newHumidity = (float) event.getNewValue();
            updateHumidity(newHumidity);
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " +
                humidity + "% humidity");
    }
}
