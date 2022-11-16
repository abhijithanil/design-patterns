package com.inspire17.tutorial.lld.strucuralpattern.bridge;

public class Square extends Shapes {

  public Square(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.print("Drawing Square and ");
    fill();
  }
}
