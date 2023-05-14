package com.bogdancode.weather_station;


public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData(); //subject

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);  //observer with the subject
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData); //observer
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData); //observer
        HeatIndex heatIndex = new HeatIndex(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90, 29.2f);


    }
}
