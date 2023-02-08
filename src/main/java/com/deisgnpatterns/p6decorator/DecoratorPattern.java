package com.deisgnpatterns.p6decorator;

import java.util.function.Function;

public class DecoratorPattern {
    public static void main(String[] args)  {
        Function<Integer, Integer> increased = value -> value + 1;
        Function<Integer, Integer> doubled = value -> value * 2;

        print(5, "incremented" , increased);
        print(5, "doubled" , doubled);
        print(5, "incremented and doubled" ,increased.andThen(doubled));//combining functions
        print(5,"test", increased.compose(doubled));//compose takes before
    }

    public static void print(int number, String message, Function<Integer, Integer> func) {
        System.out.println(number + " " + message + ": " + func.apply(number));
    }
}
