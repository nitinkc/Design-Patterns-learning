package com.deisgnpatterns.Behavioral.B5TemplatePattern;

public abstract class Algorithm {
	
	public abstract void initialize();
	public abstract void sorting();
	public abstract void printResults();
	
	public void sort(){
		initialize();
		sorting();
		printResults();
	}
}
