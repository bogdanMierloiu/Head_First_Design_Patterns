package com.bogdancode.weather_station;


public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData(); //subject

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();  //observer with the subject
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(); //observer
        ForecastDisplay forecastDisplay = new ForecastDisplay(); //observer
//        HeatIndex heatIndex = new HeatIndex(weatherData);


        weatherData.addPropertyChangeListener(currentDisplay);
        weatherData.addPropertyChangeListener(forecastDisplay);
        weatherData.addPropertyChangeListener(statisticsDisplay);
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("--------");
        weatherData.setMeasurements(82, 70, 29.2f);
//        weatherData.setMeasurements(78, 90, 29.2f);


    }
}
