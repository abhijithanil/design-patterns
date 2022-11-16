package com.inspire17.tutorial.lld.strucuralpattern.adapter;

public class RoundHole extends RoundPeg {

  private int radius;

  public RoundHole(int radius) {
    super(radius);
    this.radius = radius;
  }

  @Override
  public int getRadius() {
    return super.getRadius();
  }

  public boolean fit(RoundPeg roundPeg) {
    return this.getRadius() >= roundPeg.getRadius();
  }
}
