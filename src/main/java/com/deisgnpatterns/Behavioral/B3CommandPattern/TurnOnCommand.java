package com.deisgnpatterns.Behavioral.B3CommandPattern;

public class TurnOnCommand implements Command{

	private Light light;
	
	public TurnOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.turnOn();
	}
}
