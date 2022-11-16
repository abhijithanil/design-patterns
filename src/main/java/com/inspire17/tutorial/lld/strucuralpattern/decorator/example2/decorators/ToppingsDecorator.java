package com.inspire17.tutorial.lld.strucuralpattern.decorator.example2.decorators;

import com.inspire17.tutorial.lld.strucuralpattern.decorator.example2.BasePizza;

public class ToppingsDecorator implements BasePizza {
  protected BasePizza basePizza;
  protected int toppingsPrice;

  public ToppingsDecorator(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  @Override
  public double getPrice() {
    return this.basePizza.getPrice() + toppingsPrice;
  }
}
