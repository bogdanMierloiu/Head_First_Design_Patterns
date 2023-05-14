package com.bogdancode.weather_station;

public class ForecastDisplay implements Observer, DisplayElement {

    Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
