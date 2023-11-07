package com.deisgnpatterns.D3Behavioral.B1Strategy.addMult;

public class Add implements Strategy{

	@Override
	public void operation(int num1, int num2) {
		System.out.println(num1+num2);
	}
}
