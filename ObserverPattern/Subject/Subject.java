package DesignPatterns.ObserverPattern.Subject;

import DesignPatterns.ObserverPattern.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
