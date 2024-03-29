package com.code.fluency

class Mailer {
  public void from(String addr) { System.out.println("from..."); }
  public void to(String addr) { System.out.println("to..."); }
  public void subject(String line) { System.out.println("subject..."); }
  public void body(String content) { System.out.println("body..."); }
  public void send() { System.out.println("sending..."); }
}

public class Sample {
  public static void main(String[] args) {
    Mailer mailer = new Mailer();
    mailer.from("builder@agiledeveloper.com");
    mailer.to("venkats@agiledeveloper.com");
    mailer.subject("Your code sucks");
    mailer.body("...details...");
    mailer.send();
  }
}

