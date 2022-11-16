package com.inspire17.tutorial.lld.strucuralpattern.decorator.example1.impl;

import com.inspire17.tutorial.lld.strucuralpattern.decorator.example1.ChristmasTree;
import com.inspire17.tutorial.lld.strucuralpattern.decorator.example1.decorators.LightDecorator;

public class Lights extends LightDecorator {
  public Lights(ChristmasTree c) {
    super(c);
  }

  @Override
  public void decorate() {
    super.decorate();
    System.out.println("Decorating with lights");
  }
}
