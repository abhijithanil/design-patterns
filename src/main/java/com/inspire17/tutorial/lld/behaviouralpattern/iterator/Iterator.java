package com.inspire17.tutorial.lld.behaviouralpattern.iterator;

public interface Iterator {
  Object next();

  boolean hasNext();

  Object previous();

  boolean hasPrevious();

  void setLast();
}
