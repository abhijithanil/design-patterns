package com.inspire17.tutorial.lld.creationalpattern.factory;

public abstract class Person {
  String name;

  Person(String name) {
    this.name = name;
  }

  public abstract String name();

  public abstract String gender();

  public abstract String eligibility();
}
