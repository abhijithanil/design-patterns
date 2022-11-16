package com.inspire17.tutorial.lld.strucuralpattern.bridge;

public class Main {
  public static void main(String[] args) {
    Shapes s = new Square(new RedColor());
    Shapes s1 = new Square(new BlueColor());
    s.draw();
    s1.draw();
  }
}
