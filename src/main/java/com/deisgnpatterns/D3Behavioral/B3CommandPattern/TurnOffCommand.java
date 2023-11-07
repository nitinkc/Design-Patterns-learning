package com.deisgnpatterns.D3Behavioral.B3CommandPattern;

public class TurnOffCommand implements Command{

	private Light light;
	
	public TurnOffCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.turnOff();
	}
}
