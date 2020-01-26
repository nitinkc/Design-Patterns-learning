package com.deisgnpatterns.Behavioral.B2Observer.O1WeatherObserver;

public interface Observer {
	public void update(int pressure, int temperature, int humidity);
}
