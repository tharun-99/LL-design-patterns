package DesignPatterns.ObserverPattern.Subject;

import DesignPatterns.ObserverPattern.Observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

    // have an Arraylist of observers
    private ArrayList<Observer> observersList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observersList.contains(observer)) {
            System.out.println("Observer already registered!");
        }
        else {
            observersList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!observersList.contains(observer)) {
            System.out.println("Observer is not registered in the first place!");
        }
        else {
            observersList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observersList) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
