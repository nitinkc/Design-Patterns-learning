package com.mock;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Random;

public class FakeService {
    Random generator = new Random(123);
    int randomNumber = generator.nextInt(50);

    public int getRandNumber(){
        return this.randomNumber;
    }
    public List<String> fakeStringsFromDb(){
        if (getRandNumber() < 3)
            return null;//Bad Practise by a Programmer

        return List.of(Faker.instance().programmingLanguage().toString());
    }
}