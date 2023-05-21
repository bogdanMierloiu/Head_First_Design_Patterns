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

        WeatherData oldWeatherData = new WeatherData();

        //Construirea obiectului oldWheaterData
        oldWeatherData.setTemperature(this.temperature);
        oldWeatherData.setHumidity(this.humidity);
        oldWeatherData.setPressure(this.pressure);

        //Actualizarea valorilor curente
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        //Notificare observatori
        propertyChangeSupport.firePropertyChange("weatherData", oldWeatherData, this);

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

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
