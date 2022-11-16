package com.inspire17.tutorial.lld.strucuralpattern.decorator.example2;

import com.inspire17.tutorial.lld.strucuralpattern.decorator.example2.decorators.MushroomPizza;
import com.inspire17.tutorial.lld.strucuralpattern.decorator.example2.decorators.TunaPizza;

public class Main {
  public static void main(String[] args) {
    BasePizza pizza = new MushroomPizza(new BasePizzaImpl());
    System.out.println(pizza.getPrice());
    BasePizza newPizza = new MushroomPizza(new TunaPizza(new BasePizzaImpl()));
    System.out.println(newPizza.getPrice());
  }
}
