package com.deisgnpatterns.D4Structural.S2FacadePattern;

public class SortingFacade {

	private Algorithm bubbleSort;//Programming to Interface
	private Algorithm mergeSort;
	private Algorithm heapSort;
	
	public SortingFacade(){
		this.bubbleSort = new BubbleSort();
		this.mergeSort = new MergeSort();
		this.heapSort = new HeapSort();
	}
	
	public void mergeSort(){
		this.mergeSort.sort();
	}
	
	public void bubbleSort(){
		this.bubbleSort.sort();
	}
	
	public void heapSort(){
		this.heapSort.sort();
	}
}
