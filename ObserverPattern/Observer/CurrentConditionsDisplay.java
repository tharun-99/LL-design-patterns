package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.DisplayElement.DisplayElement;
import DesignPatterns.ObserverPattern.Subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("CURRENT CONDITIONS");
        System.out.println("Temperature : " + this.temperature);
        System.out.println("Humidity : " + this.humidity);
        System.out.println("-----------------------");
    }
}
