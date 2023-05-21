package com.bogdancode.weather_station;


public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData(); //subject

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();  //observer with the subject
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        HeatIndex heatIndex = new HeatIndex();


        weatherData.addPropertyChangeListener(currentDisplay);
        weatherData.addPropertyChangeListener(forecastDisplay);
        weatherData.addPropertyChangeListener(statisticsDisplay);
        weatherData.addPropertyChangeListener(heatIndex);


        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("---------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("---------");
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
