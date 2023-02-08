package com.deisgnpatterns.Structural.S2FacadePattern;

/**
 *  This pattern provides a unified interface to a
 *   set of interfaces in a system 
 *   
 *   		It defines a high level interface 
 *   		that makes the subsystem easier to use 
 * 
 */

public class App {

	public static void main(String[] args) {
		
		SortingFacade manager = new SortingFacade();
		
		manager.bubbleSort();
		manager.mergeSort();
		manager.heapSort();
		
	}
}
