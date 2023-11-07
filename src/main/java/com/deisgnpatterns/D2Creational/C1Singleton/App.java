package com.deisgnpatterns.D2Creational.C1Singleton;

public class App {

	/**
	 * Singleton Pattern -> restricts the instantiation of a class to one object
	 * This is useful when exactly one object is needed to coordinate actions across the system
	 */
	public static void main(String[] args) {

		System.out.println(SingletonClass.getInstanceOfSingleton());
	}
}
