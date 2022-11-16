package com.inspire17.tutorial.lld.creationalpattern.builder;

public class Main {
  public static void main(String[] args) {
    User user = new User.Builder().firstName("Abhijith").secondName("Anil").build();
    System.out.println(user.getFirstName());
  }
}
