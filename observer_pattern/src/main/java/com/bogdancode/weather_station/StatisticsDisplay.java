package com.bogdancode.weather_station;

import com.bogdancode.weather_station.DisplayElement;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsDisplay implements PropertyChangeListener, DisplayElement {

    private float temperature;
    private List<Float> temperatures = new ArrayList<>();

    public StatisticsDisplay() {
    }

    @Override
    public void display() {
        if (temperatures.isEmpty()) {
            System.out.println("No temperature data available.");
            return;
        }

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
    public void propertyChange(PropertyChangeEvent event) {
        String propertyName = event.getPropertyName();
        if ("temperature".equals(propertyName)) {
            float newTemperature = (float) event.getNewValue();
            updateTemperature(newTemperature);
        }
    }

    private void updateTemperature(float newTemperature) {
        this.temperature = newTemperature;
        temperatures.add(temperature);
        display();
    }
}
