package com.deisgnpatterns.Behavioral.B1Strategy.addMult;

public class Multiply implements Strategy{

	@Override
	public void operation(int num1, int num2) {
		System.out.println(num1*num2);
	}
}
