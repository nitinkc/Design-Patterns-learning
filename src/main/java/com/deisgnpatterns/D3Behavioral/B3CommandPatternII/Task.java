package com.deisgnpatterns.D3Behavioral.B3CommandPatternII;

public class Task {

	private int id;
	
	public Task(int id){
		this.id = id;
	}
	
	public void solveProblem(){
		System.out.println("Solving problem "+this.id);
	}
}
