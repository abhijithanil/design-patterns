package com.inspire17.tutorial.lld.strucuralpattern.decorator.example1;

// component implementation
public class ChristmasTreeImpl implements ChristmasTree {
  @Override
  public void decorate() {
    System.out.println("Decorating Christmas tree");
  }
}
