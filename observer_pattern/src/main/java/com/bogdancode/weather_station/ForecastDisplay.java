package com.bogdancode.weather_station;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ForecastDisplay implements PropertyChangeListener, DisplayElement {

    private float previousTemperature;

    private float currentTemperature;


    public ForecastDisplay() {
    }

    public void updateTemperature(float newTemperature) {
        this.previousTemperature = this.currentTemperature;
        this.currentTemperature = newTemperature;
        display();
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        String propertyName = event.getPropertyName();
        if ("temperature".equals(propertyName)) {
            float newTemperature = (float) event.getNewValue();
            updateTemperature(newTemperature);
        }
    }

    @Override
    public void display() {
        if (currentTemperature > previousTemperature) {
            System.out.println("Temperatura a crescut");
        } else if (currentTemperature < previousTemperature) {
            System.out.println("Temperatura a scazut!");
        } else {
            System.out.println("Temperatura a ramas la fel!");
        }

    }
}
