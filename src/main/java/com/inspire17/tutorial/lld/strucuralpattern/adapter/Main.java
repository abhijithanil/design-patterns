package com.inspire17.tutorial.lld.strucuralpattern.adapter;

public class Main {

  public static void main(String[] args) {
    // Somewhere in client code.
    RoundHole hole = new RoundHole(5);
    RoundPeg rPeg = new RoundPeg(5);
    System.out.println(hole.fit(rPeg));

    SquarePeg smallSqpeg = new SquarePeg(5);
    SquarePeg largeSqpeg = new SquarePeg(10);
    //      System.out.println(hole.fit(small_sqpeg)) this won't compile (incompatible types)

    SquarePegAdapter smallSqpegAdapter = new SquarePegAdapter(smallSqpeg);
    SquarePegAdapter largSqpegAdapter = new SquarePegAdapter(largeSqpeg);
    System.out.println(hole.fit(smallSqpegAdapter));
    System.out.println(hole.fit(largSqpegAdapter));
  }
}
