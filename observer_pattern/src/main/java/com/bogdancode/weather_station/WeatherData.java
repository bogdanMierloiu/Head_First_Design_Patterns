package com.bogdancode.weather_station;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherData {

    PropertyChangeSupport propertyChangeSupport;
    float temperature;
    float humidity;
    float pressure;

    public WeatherData() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        float oldTemperature = this.temperature;
        float oldHumidity = this.humidity;
        float oldPressure = this.pressure;

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;


        propertyChangeSupport.firePropertyChange("temperature", oldTemperature, temperature);
        propertyChangeSupport.firePropertyChange("humidity", oldHumidity, humidity);
        propertyChangeSupport.firePropertyChange("pressure", oldPressure, pressure);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
