package com.bogdancode.weather_station;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private Subject weatherData;

    List<Float> temperatures = new ArrayList<>();

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        Float minValue = Collections.min(temperatures);
        Float maxValue = Collections.max(temperatures);
        float sum = 0.0f;
        for (Float value : temperatures) {
            sum += value;
        }
        float averageValue = sum / temperatures.size();
        System.out.println("Avg/Max/Min temperature = " + averageValue + "/" + maxValue + "/" + minValue);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        temperatures.add(temperature);
        display();
    }

}
