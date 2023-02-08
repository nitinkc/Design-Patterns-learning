package com.deisgnpatterns.p5laziness;

import java.util.function.Supplier;

class Lazy<T> {
  private T instance;
  private Supplier<T> supplier;

  public Lazy(T value) {//Eager Evaluation
    instance = value;
  }

  public Lazy(Supplier<T> supplier) {//Lazy Evaluation
    this.supplier = supplier;
  }

  public T get() {//Getter
    if(null == instance) {
      instance = supplier.get();
    }
    return instance;
  }
}



