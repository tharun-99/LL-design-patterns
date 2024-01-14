package DesignPatterns.ObserverPattern.Main;

import DesignPatterns.ObserverPattern.Observer.CurrentConditionsDisplay;
import DesignPatterns.ObserverPattern.Observer.StatisticsDisplay;
import DesignPatterns.ObserverPattern.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        weatherData.setMeasurements(80, 65, 34.4f);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        weatherData.setMeasurements(87, 55, 13.4f);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        weatherData.setMeasurements(98, 40, 89.4f);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
