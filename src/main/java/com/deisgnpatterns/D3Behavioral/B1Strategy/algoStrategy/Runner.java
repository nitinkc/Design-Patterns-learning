package com.deisgnpatterns.D3Behavioral.B1Strategy.algoStrategy;

import java.util.List;
import java.util.function.Supplier;

public class Runner {

    public static void main(String[] args) {
        List<Number> list = List.of(1,3,5,7,9,8,6,4,2);

        //Style 1
        Contextt con = new Contextt();
        //con.setStrategy(new BubbleSort());//Strategy is bubbleSort at runtime
        //con.sortAlgo(list);//Calling the first way

        //Style 2, from overloaded method
        con.sortAlgo(list, new QuickSort());

        //Style 3, via supplier
        Supplier<QuickSort> quickSortSupplier = QuickSort::new;
        con.sortAlgo(list, quickSortSupplier.get());




    }
}
