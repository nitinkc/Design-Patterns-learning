package com.deisgnpatterns.D2Creational.C3BuilderPattern;

public class App {

	/**
	 * 	WHY TO PREFER BUILDER PATTERN?
	 * 	Builder === Constructor in India
	 * 
	 * 	- there would be lots of parameters in the constructor  ~ hard to follow
	 * 		Hard not to confuse parameters !!!
	 * 				~ setters are the same, not the best solution
	 * 
	 * 	- not extensible: when we have to add one more optional parameters, we have to create a new constructor
	 * 			Telescoping constructors appear !!!
	 * 				With a builder --> we just add another method 
	 * 
	 * 	- immutable property: we should consider parallel execution
	 * 		The best is to use objects that can not be modified after they have been created
	 * 				"immutable objects"
	 * 			~ so there will not be any problems because of concurrent updates by
	 * 				multiple threads
	 * 
	 */
	
	public static void main(String[] args) {
		Person person1 = new Person.Builder("Balazs", "balazs@gmail.com")
				.setAddress("nitin")
				.build();
		
		System.out.println(person1);
	}
}
