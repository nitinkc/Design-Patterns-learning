package com.deisgnpatterns.D3Behavioral.B6NullObjectPattern;

public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String personName){
		this.personName = personName;
	}
	
	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getPerson() {
		return this.personName;
	}
}
