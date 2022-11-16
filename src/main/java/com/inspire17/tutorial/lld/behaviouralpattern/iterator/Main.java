package com.inspire17.tutorial.lld.behaviouralpattern.iterator;

public class Main {
  public static void main(String[] args) {
    NameRepository nameRepository = new NameRepository();
    Iterator iterator = nameRepository.getIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    Iterator iterator1 = nameRepository.getIterator();
    iterator1.setLast();
    while (iterator1.hasPrevious()) {
      System.out.println(iterator1.previous());
    }
  }
}
