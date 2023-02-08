package com.deisgnpatterns.Behavioral.B1Strategy.algoStrategy;

import lombok.Setter;

import java.util.List;

@Setter
public class Contextt {

    Strategy strategy;//this is composition : HINT

    public <T> void sortAlgo(List<T> list){
        strategy.sort(list);
    }

    public <T> void sortAlgo(List<T> list, Strategy strategy){//Passing interface as an argument
        strategy.sort(list);
    }
}
