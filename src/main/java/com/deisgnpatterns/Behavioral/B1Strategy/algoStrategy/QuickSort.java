package com.deisgnpatterns.Behavioral.B1Strategy.algoStrategy;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class QuickSort implements Strategy {

    @Override
    public <T> void sort(List<T> list) {
        System.out.println("Quick Sort :: " + list.getClass());
    }

}
