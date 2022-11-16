package com.inspire17.tutorial.lld.strucuralpattern.bridge;

public abstract class Shapes implements Color {
  protected Color color;

  public Shapes(Color color) {
    this.color = color;
  }

  @Override
  public void fill() {
    color.fill();
  }

  public abstract void draw();
}
