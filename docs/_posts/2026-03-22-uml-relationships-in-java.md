---
title: "UML Relationships in Java: Code-First Tour of com.uml"
date: 2026-03-22 23:45:00
categories: [uml, java, design]
tags: [dependency, association, aggregation, composition, generalization, realization, multiplicity]
---

This post documents every `com.uml` package in this workspace. Each section includes a small Java snippet plus the matching PlantUML diagram so you can map code to UML quickly.

## Shared model in `com.uml`

**Code snippet (base types and relationships)**
```java
public class Car extends Vehicle implements Drivable {
    private List<Wheel> wheels;
    private Engine engine;

    public Car(List<Wheel> wheels) {
        this.wheels = wheels;
        this.engine = new Engine(200, "petrol");
    }

    public void drive(Engine engine) {
        // Uses Engine as a parameter (dependency)
    }
}

public class Vehicle { }
public interface Drivable { }

public class Engine {
    public Engine(int horsepower, String fuelType) { }
}

public class Wheel { }
```

**Code snippet (has-a example in `com.uml.HasA`)**
```java
class Bird {
    Beak beak; // Bird HAS-A Beak
}

class Beak {
    String color;
    double length;
}
```

**PlantUML (inferred from code; no `.puml` file in `com.uml`)**

@startuml
class Vehicle
interface Drivable
class Engine
class Wheel
class Car
class Bird
class Beak

Vehicle <|-- Car
Drivable <|.. Car
Car o-- Wheel
Car *-- Engine
Car ..> Engine : drive(engine)
Bird o-- Beak
@enduml


## Dependency (`com.uml.a1dependency`)

**Code snippet (constructor injection + usage)**
```java
private final Engine engine;

public Car(Engine engine) {
    this.engine = engine;
}

public void drive() {
    engine.start();
}
```

**PlantUML**

@startuml
class Engine {
    - horsepower: int
    - fuelType: String

    + Engine(int horsepower, String fuelType)
    + start(): void
    + stop(): void
}

class Car {
    - engine: Engine

    + Car(Engine engine)
    + drive(): void
    + stop(): void
}

Car --> Engine
@enduml


## Association (one-way) + multiplicity (`com.uml.a2association.oneWay`)

**Code snippet (one-to-many link)**
```java
public class Department {
    private List<Employee> employees;

    public Department(List<Employee> employees) {
        this.employees = employees;
    }
}

@Data
public class Employee {
    private String name;
    private int id;
}
```

**PlantUML**

@startuml
class Employee {
    - name: String
    - id: int

    + Employee(name: String, id: int)
    + getName(): String
    + getId(): int
}

class Department {
    - employees: List<Employee>

    + Department(employees: List<Employee>)
    + addEmployee(employee: Employee): void
    + removeEmployee(employee: Employee): void
    + getEmployees(): List<Employee>
}

Department "1" --> "0..*" Employee
@enduml


## Association (two-way) (`com.uml.a2association.bothway`)

**Code snippet (bidirectional link)**
```java
public class User {
    private Email email;

    public User(Email email) {
        this.email = email;
    }
}

public class Email {
    private User recipient;

    public Email(User recipient) {
        this.recipient = recipient;
    }
}
```

**PlantUML**

@startuml
class User {
    - email: Email

    + User(email: Email)
    + sendEmail(content: String): void
}

class Email {
    - recipient: User

    + Email(recipient: User)
    + send(content: String): void
}

User -- Email : both call each other
@enduml


## Aggregation (`com.uml.a3aggregation`)

**Code snippet (external part passed in)**
```java
private final Engine engine;

public Car(Engine engine) {
    this.engine = engine;
}
```

**PlantUML**

@startuml
class Car {
    Engine engine
}

class Engine {
    // Engine class definition
}

Car o-- Engine
@enduml


## Composition (`com.uml.a4composition`)

**Code snippet (part created inside)**
```java
public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine(200, "diesel");
    }
}

public class House {
    private List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
    }
}
```

**PlantUML**

@startuml
class Car {
    // Containing class
}

class Engine {
    // Contained class
}

Car *-- Engine

class Room {
    // Room class definition
}

class House {
    - rooms: List<Room> // Composition relationship

    + House()
    + addRoom(room: Room): void
    + removeRoom(room: Room): void
    + getRooms(): List<Room>
}

House *-- "1..*" Room
@enduml


## Generalization / inheritance (extends) (`com.uml.a5generalizationIsA.withExtends`)


### Generalization / inheritance (extends)
**Code snippet (is-a hierarchy)**
```java
public class Vehicle {
    public Vehicle(String manufacturer, int year) { }
}

public class Car extends Vehicle {
    public Car(String manufacturer, int year, String model, int mileage) {
        super(manufacturer, year);
    }
}

public class Boat extends Vehicle {
    public Boat(String manufacturer, int year, String type, int length) {
        super(manufacturer, year);
    }
}
```

**PlantUML**

@startuml
class Vehicle {
    String manufacturer
    int year

    + Vehicle(manufacturer: String, year: int)
    + accelerate(): void
    + brake(): void
}

class Car {
    String model
    int mileage

    + Car(manufacturer: String, year: int, model: String, mileage: int)
    + honk(): void
    + brake(): void
}

class Boat {
    String type
    int length

    + Boat(manufacturer: String, year: int, type: String, length: int)
    + raiseAnchor(): void
    + lowerAnchor(): void
    + brake(): void
}

Vehicle <|-- Car
Vehicle <|-- Boat

interface Animal {
    void eat();
    void sleep();
}

interface Pet {
    void play();
    void cuddle();
}

class Cat {
    implements Animal, Pet
}

Animal <|-- Cat
Pet <|-- Cat
@enduml


## Generalization / realization (implements) (`com.uml.a5generalizationIsA.withInterface`)

**Code snippet (interface realization)**
```java
public interface Animal {
    void eat();
    void sleep();
}

public interface Pet {
    void play();
    void cuddle();
}

public class Cat implements Animal, Pet {
    public void eat() { }
    public void sleep() { }
    public void play() { }
    public void cuddle() { }
}
```

## Multiplicity (`com.uml.diagrams.multiplicity`)

**Code snippet (multiplicity hint)**
```java
public class Department {
    private List<Employee> employees; // one-to-many
}
```

**PlantUML**

@startuml
class Department {
    // Containing class
}

class Employee {
    // Contained class
}

Department "1" *-- "many" Employee
@enduml


## Annotation-style relationship labels (`com.uml.diagrams.forAnnotations`)

**Code snippet (implements in Java)**
```java
public class Car extends Vehicle implements Drivable { }
```

**PlantUML**

@startuml
interface Drivable {
    // Interface
}

class Car {
    // Dependent class implementing an interface
}

Car ..> Drivable : <<implements>>
@enduml


## Elaborate end-to-end diagram (`com.uml.elaborate`)

**Code snippet (richer model)**
```java
public class Car extends Vehicle implements Drivable {
    private List<Wheel> wheels;
    private Engine engine;

    public Car(String manufacturer, String model, List<Wheel> wheels, Engine engine) {
        super(manufacturer, model);
        this.wheels = wheels;
        this.engine = engine;
    }
}

public class Boat extends Vehicle implements Drivable {
    private Engine engine;
    private Rudder rudder;

    public Boat(String manufacturer, String model, int length, String type, Engine engine, Rudder rudder) {
        super(manufacturer, model);
        this.engine = engine;
        this.rudder = rudder;
    }
}
```

**PlantUML**

@startuml
class Vehicle {
    - manufacturer: String
    - model: String

     + Vehicle(manufacturer: String, model: String)
     + accelerate(speed: int): void
     + brake(): void
}

interface Drivable {
    + start(): void
    + stop(): void
}

class Wheel {
    - size: int
    - type: String

     + Wheel(size: int, type: String)
     + rotate(): void
}

class Engine {
    - horsepower: int
    - fuelType: String

     + Engine(horsepower: int, fuelType: String)
     + start(): void
     + stop(): void
}

class Car {
    - wheels: List<Wheel> // Aggregation: Car "has-a" List of Wheel objects
    - engine: Engine // Aggregation: Car "has-a" Engine object
    - speed: int

     + Car(manufacturer: String, model: String, wheels: List<Wheel>, engine: Engine)
     + drive(): void
}

class Boat {
    - length: int
    - type: String
    - engine: Engine // Aggregation: Boat "has-a" Engine object
    - rudder: Rudder // Aggregation: Boat "has-a" Rudder object

     + Boat(length: int, type: String, engine: Engine, rudder: Rudder)
     + navigate(): void
}

class Rudder {
    // Rudder class definition
}

Vehicle <|-- Car : Inheritance (IS-A)
Vehicle <|-- Boat : Inheritance (IS-A)
Car o-- Wheel : Aggregation
Drivable <|.. Car : Implementation
Drivable <|.. Boat : Implementation
Car o-- Engine : Aggregation
Boat o-- Engine : Aggregation
Boat o-- Rudder : Aggregation
@enduml



### Association class

**Code snippet (relationship with its own data)**
```java
public class Enrollment {
    private final Student student;
    private final Course course;
    private final String semester;

    public Enrollment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }
}
```

**PlantUML**
@startuml
class Student
class Course
class Enrollment {
    - semester: String
}

Student "1" -- "0..*" Enrollment
Course "1" -- "0..*" Enrollment
@enduml

### N-ary association

**Code snippet (three participants)**
```java
public class Meeting {
    private final Person host;
    private final Room room;
    private final CalendarDay day;

    public Meeting(Person host, Room room, CalendarDay day) {
        this.host = host;
        this.room = room;
        this.day = day;
    }
}
```

**PlantUML**

@startuml
class Person
class Room
class CalendarDay
class Meeting

Person "1" -- "0..*" Meeting
Room "1" -- "0..*" Meeting
CalendarDay "1" -- "0..*" Meeting
@enduml

### Package diagram

**PlantUML**

@startuml
package "com.uml.a2association" {
    class Department
    class Employee
}

package "com.uml.a4composition" {
    class House
    class Room
}

"com.uml.a2association" ..> "com.uml.a4composition" : uses
@enduml

### Visibility + role names

**Code snippet (roles on association ends)**
```java
public class Library {
    private List<Book> holdings; // role: holdings
}

public class Book {
    private Library homeLibrary; // role: homeLibrary
}
```

**PlantUML**

@startuml
class Library
class Book

Library "1" -- "0..*" Book : holdings
Book "0..*" -- "1" Library : homeLibrary
@enduml

