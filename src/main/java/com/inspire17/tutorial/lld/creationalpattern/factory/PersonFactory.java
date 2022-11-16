package com.inspire17.tutorial.lld.creationalpattern.factory;

public class PersonFactory {
  public static Person getPerson(String name, String gender, int age) {
    if (gender.equalsIgnoreCase("M")) {
      return new Male(name, age);
    } else if (gender.equalsIgnoreCase("F")) {
      return new Female(name, age);
    }
    return null;
  }

  private static class Female extends Person {
    private int age;

    Female(String name, int age) {
      super(name);
      this.age = age;
    }

    @Override
    public String name() {
      return name;
    }

    @Override
    public String gender() {
      return "F";
    }

    @Override
    public String eligibility() {
      if (age > 18) {
        return "Can Marry";
      }
      return "Cannot Marry";
    }
  }

  private static class Male extends Person {

    private int age;

    Male(String name, int age) {
      super(name);
      this.age = age;
    }

    @Override
    public String name() {
      return name;
    }

    @Override
    public String gender() {
      return "M";
    }

    @Override
    public String eligibility() {
      if (age > 21) {
        return "Can Marry";
      }
      return "Cannot Marry";
    }
  }
}
