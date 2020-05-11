package com.deisgnpatterns.Behavioral.B4IteratorPattern;

public class NameRepository {

	private String[] names = { "Adam","Joe","John","Sarah" };
	
	public Iterator getIterator(){
		return new NameIterator(names);
	}
}
