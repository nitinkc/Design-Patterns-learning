package com.deisgnpatterns.Behavioral.B2Observer.O1WeatherObserver;

public interface Subject {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyAllObservers();
}
