package com.deisgnpatterns.D3Behavioral.B6NullObjectPattern;

public class NullCustomer extends AbstractCustomer {
	
	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getPerson() {
		return "No person with the given name in the database...";
	}
}
