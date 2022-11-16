package com.inspire17.tutorial.lld.strucuralpattern.decorator.example2.decorators;

import com.inspire17.tutorial.lld.strucuralpattern.decorator.example2.BasePizza;

public class TunaPizza extends ToppingsDecorator {
  public TunaPizza(BasePizza basePizza) {
    super(basePizza);
    toppingsPrice = 75;
  }

  @Override
  public double getPrice() {
    return basePizza.getPrice() + toppingsPrice;
  }
}
