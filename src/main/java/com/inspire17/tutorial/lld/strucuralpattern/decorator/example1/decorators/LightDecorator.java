package com.inspire17.tutorial.lld.strucuralpattern.decorator.example1.decorators;

import com.inspire17.tutorial.lld.strucuralpattern.decorator.example1.ChristmasTree;

public class LightDecorator implements ChristmasTree {
  protected ChristmasTree christmasTree;

  public LightDecorator(ChristmasTree c) {
    this.christmasTree = c;
  }

  @Override
  public void decorate() {
    this.christmasTree.decorate();
  }
}
