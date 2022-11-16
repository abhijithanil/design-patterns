package com.inspire17.tutorial.lld.strucuralpattern.adapter;

public class SquarePegAdapter extends RoundPeg {
  SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    super((int) (squarePeg.getWidth() * Math.sqrt(2) / 2));
    this.squarePeg = squarePeg;
  }
}
