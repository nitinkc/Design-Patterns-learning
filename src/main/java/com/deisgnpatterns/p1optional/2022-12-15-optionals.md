# Optionals - Patterns & Antipatterns

A good design reads like a story and not like a puzzle

Null is a smell

> Do not return a null, instead return an empty *collection*. Effective Java

## What if we have a single value?

* Instead of returning null return Option<T>
* If a method will always have a single value as return *donot use* Optional.

```java
var result = getName();
String str = result.orElse("not found");//Default Value
// str = result.orElseGet(String::new);//Empty String
//str = result.orElseThrow();//if at all you need to use get, then use orThrow instead
//str = result.get();//DO NOT USE THIS due to the danger on NPE
```
## Do's and Dont's

* If a method may or may not have a single value as a result, **then use Optional**.
```java
public static Optional<String> getName() {
    if(fakeService.getRandNumber() < 3) {
      return Optional.of("Name");
    }

    //return null; //ABSOLUTELY NO. it works but it's NASTY CODE
    return Optional.empty();
  }
```
* If the result is a collection, then don't use Optional, instead return empty collection
```java
public static Optional<String> getName() {
    if(fakeService.getRandNumber() < 3) {
      return Optional.of("Name");
    }

    //return null; //ABSOLUTELY NO. it works but it's NASTY CODE
    return Optional.empty();
  }

```

* Don't use Optional<T> as a parameter to methods. If needed, use overloading instead.
```java
    public static void methodName(String str)
    public static void methodName(Optional<String> name); //Anti-pattern - DO NOT DO THIS
```
Optional in the argument will force/punish the programmers/users when the method is invoked

```java
methodName(Optional.empty());
OR
methodName(Optional.of(str));
```

Instead use overloading
```java
  //A good design has empathy
  public static void methodName() {
    //use the default value
  }

  public static void methodName(String name) {
    //use the given name
  }
```

* There is little reason to use Optional as a field.

