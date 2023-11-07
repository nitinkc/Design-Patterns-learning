package com.mock;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class MockUtility {

    static Faker instance = Faker.instance();

    public static List<String> randomFirstName(int count){
        //List<String> names = null;//Don't Do this
        List<String> names = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            names.add(instance.name().firstName());
        }
        return names;
    }
}
