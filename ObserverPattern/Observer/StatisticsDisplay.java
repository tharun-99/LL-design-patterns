package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.DisplayElement.DisplayElement;
import DesignPatterns.ObserverPattern.Subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemperature = Integer.MAX_VALUE;
    private float maxTemperature = Integer.MIN_VALUE;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.minTemperature = Math.min(temperature, this.minTemperature);
        this.maxTemperature = Math.max(temperature, this.maxTemperature);
        display();
    }

    @Override
    public void display() {
        System.out.println("STATISTICS");
        System.out.println("MIN TMP : " + this.minTemperature);
        System.out.println("MAX TMP : " + this.maxTemperature);
        System.out.println("AVG TMP : " + (this.maxTemperature + this.minTemperature)/2);
        System.out.println("----------------------------");
    }
}
