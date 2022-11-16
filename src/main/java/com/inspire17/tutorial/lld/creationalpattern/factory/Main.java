package com.inspire17.tutorial.lld.creationalpattern.factory;

public class Main {
  public static void main(String[] args) {
    Person p1 = PersonFactory.getPerson("Jack", "m", 20);
    System.out.println(p1.name() + " is " + p1.gender() + " and " + p1.eligibility());
    Person p2 = PersonFactory.getPerson("Rose", "f", 20);
    System.out.println(p2.name() + " is " + p2.gender() + " and " + p2.eligibility());
  }
}
