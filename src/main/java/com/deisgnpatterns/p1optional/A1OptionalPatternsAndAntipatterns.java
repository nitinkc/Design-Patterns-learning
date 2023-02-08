package com.deisgnpatterns.p1optional;

import com.mock.FakeService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class A1OptionalPatternsAndAntipatterns {

  static FakeService fakeService = new FakeService();//instantiation gets avoided in Spring due to DI/Autowiring

  public static void main(String[] args) {
    var result = getName();

    String str = result.orElse("not found");//Default Value
    str = result.orElseGet(String::new);//Empty String
    //str = result.orElseThrow();//if at all you need to use get, then use orThrow instead
    //str = result.get();//DO NOT USE THIS WITHOUT CARE

    getStrings().stream().forEach(System.out::println);
  }

  //If a method has a single value as return, **then use Optional**.
  public static Optional<String> getName() {
    if(fakeService.getRandNumber() < 30) {
      return Optional.of("Name");
    }

    //return null; //ABSOLUTELY NO. it works but it's NASTY CODE
    return Optional.empty();
  }

  //good Practice, With Collections
  public static List<String> getStrings(){
    List<String> returnStrings = fakeService.fakeStringsFromDb();

    //Some function to be done from the return output
    //System.out.println(returnStrings.get(0));//Potential Null pointer exception

    if(returnStrings.size() == 0) {
      return Collections.emptyList();

      //using Static Factory - takes care of empty List
      //return List.of();//Returns an unmodifiable list containing zero elements.

    }

    return returnStrings;
  }
}
