package com.deisgnpatterns.p4factory;

interface MusicalInstrument {}
class Piano implements MusicalInstrument {}
class Flute implements MusicalInstrument {}

interface Maestro {
  //private MusicalInstrument musicalInstrument;//Can be used with Abstract base class but not interface

  //Rather than having a field, we can have abstract method inside an abstract class, that will return the  field
  // from the interface that programmer may return to choose
  MusicalInstrument getMusicalInstrument();//method defined with in the interface

  default void play() {
    System.out.println("plays " + getMusicalInstrument());
  }
}

class PianoMaestro implements Maestro {
  private Piano piano = new Piano();
  //Constructor
  public MusicalInstrument getMusicalInstrument() { return piano; }
}

class FluteMaestro implements Maestro {
  private Flute flute = new Flute();

  @Override
  public MusicalInstrument getMusicalInstrument() {
    return flute;
  }
}

public class Sample {
  public static void call(Maestro maestro) {
    maestro.play();
  }

  public static void main(String[] args) {
    call(new FluteMaestro());
    call(new PianoMaestro());
  }
}

