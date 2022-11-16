package com.inspire17.tutorial.lld.strucuralpattern.decorator.example2.decorators;

import com.inspire17.tutorial.lld.strucuralpattern.decorator.example2.BasePizza;

public class MushroomPizza extends ToppingsDecorator {
  public MushroomPizza(BasePizza basePizza) {
    super(basePizza);
    toppingsPrice = 25;
  }

  @Override
  public double getPrice() {
    return basePizza.getPrice() + toppingsPrice;
  }
}
