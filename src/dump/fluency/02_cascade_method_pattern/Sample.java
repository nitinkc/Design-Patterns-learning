package com.code.fluency

class Mailer {
  public Mailer from(String addr) { System.out.println("from..."); return this; }
  public Mailer to(String addr) { System.out.println("to..."); return this; }
  public Mailer subject(String line) { System.out.println("subject..."); return this; }
  public Mailer body(String content) { System.out.println("body..."); return this; }
  public void send() { System.out.println("sending..."); }
}

public class Sample {
  public static void main(String[] args) {
    new Mailer()
      .from("builder@agiledeveloper.com")
      .to("venkats@agiledeveloper.com")
      .subject("Your code sucks")
      .body("...details...")
      .se
  nd();
  }
}

//Cascade method pattern

