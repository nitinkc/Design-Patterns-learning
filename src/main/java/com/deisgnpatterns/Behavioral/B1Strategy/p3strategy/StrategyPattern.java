package com.deisgnpatterns.Behavioral.B1Strategy.p3strategy;

import java.util.List;
import java.util.function.Predicate;

public class StrategyPattern {


  public static void main(String[] args) {
    var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    System.out.println(totalValues(numbers));
    System.out.println(totalEvenValues(numbers));
    System.out.println(totalOddValues(numbers));

    System.out.println("---- Strategy Pattern ----");
    //Add All Numbers
    System.out.println(totalValues(numbers, ignore -> true));//All Numbers
    System.out.println(totalValues(numbers, even -> even%2 == 0));//Defining Predicate
    System.out.println(totalValues(numbers, StrategyPattern::isOdd));//Extracted Method

    System.out.println("---- Streams ----");
    System.out.println(totalValuesUsingStreams(numbers, StrategyPattern::isOdd));//Extracted Method

  }

  private static Boolean isOdd(int number) {
    return number % 2 != 0;
  }

  // Given collection of numbers, write a method to total all values
  public static int totalValues(List<Integer> numbers) {
    int total = 0;

    for(var number: numbers) {
      total += number;
    }

    return  total;
  }

  public static int totalEvenValues(List<Integer> numbers) {
    int total = 0;

    for(var number: numbers) {
      if(number % 2 == 0) { total += number; }
    }

    return  total;
  }

  public static int totalOddValues(List<Integer> numbers) {
    int total = 0;

    for(var number: numbers) {
      if(number % 2 != 0) { total += number; }
    }

    return  total;
  }

  //Strategies are often a single method or function. So, functional interfaces and lambdas work really well
  public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
    //Imperative Style
    int total = 0;

    for(var number: numbers) {
      if(selector.test(number)) {
        total += number;
      }
    }

    return  total;
  }

  //Final Refactoring
  public static int totalValuesUsingStreams(List<Integer> numbers, Predicate<Integer> selector) {

    //Functional Style
    return numbers.stream()
            .filter(selector)
            .mapToInt(e -> e)
            .sum();
  }

}



