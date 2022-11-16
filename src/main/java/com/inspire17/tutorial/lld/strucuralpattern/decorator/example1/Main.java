package com.inspire17.tutorial.lld.strucuralpattern.decorator.example1;

import com.inspire17.tutorial.lld.strucuralpattern.decorator.example1.impl.Bells;
import com.inspire17.tutorial.lld.strucuralpattern.decorator.example1.impl.Lights;

public class Main {
  public static void main(String[] args) {
    ChristmasTree c = new Bells(new ChristmasTreeImpl());
    c.decorate();

    ChristmasTree christmasTree = new Bells(new Lights(new ChristmasTreeImpl()));
    christmasTree.decorate();
  }
}
