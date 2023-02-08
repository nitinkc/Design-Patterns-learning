package com.deisgnpatterns.p2iterator;

import com.mock.MockUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A2IteratorPatterns {
    public static void main(String[] args) {
        var names = MockUtility.randomFirstName(5);
        System.out.println(names);
        names = List.of("Mimi", "Alvin", "Yolonda", "Donnie", "Delphine");


        //FIND 2 names with length == 4
        int count = 0;
        System.out.println("--- External Iterator ---");
        for (var name : names) {//For Each loop
            //external iterators - we control the iteration
            //useful for continue and Break
            // for(int i = 0; i <= names.size(); i++); ... //verbose
            if (name.length() >= 4) {
                System.out.println(name.toUpperCase());
                count++;

                //continue;

                if (count == 2) {
                    break;
                }
            }
        }

        System.out.println("--- Internal Iterator ---");
        //internal iterator
        names.stream()
                .filter(name -> name.length() >= 4)
                .map(String::toLowerCase)
                .limit(2)//takes care of count
                //.takeWhile(name -> name.startsWith("d"));
                .forEach(System.out::println);

        //limit and takeWhile are the functional equivalent
        //of break from the imperative style.


        var result = new ArrayList<String>();
        //var test = null;//DO NOT do result - null CANNOT Infer TYPE

        for (var name : names) {
            if (name.length() == 4) {
                result.add(name.toUpperCase());//Works Well
            }
        }

        System.out.println(result);

        var result2 = new ArrayList<String>();
        names.stream()
                .filter(name -> name.length() == 4)
                //.map(name -> performImpureOperation(name)) //avoid
                .map(String::toUpperCase)
                //.forEach(name -> result2.add(name)); //BAD IDEA with ParallelStream
                .collect(Collectors.toList()); //to Listis a better option


        System.out.println(result2);
    }
}