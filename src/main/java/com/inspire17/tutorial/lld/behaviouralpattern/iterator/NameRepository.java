package com.inspire17.tutorial.lld.behaviouralpattern.iterator;

public class NameRepository implements ItrContainer {
  String[] names = {"Abhijith", "Anagha", "Arjun", "Anil", "Mini"};

  @Override
  public Iterator getIterator() {
    return new Iterator() {
      int index;

      @Override
      public Object next() {
        if (this.hasNext()) {
          return names[index++];
        }
        return null;
      }

      @Override
      public boolean hasNext() {
        if (index < names.length) {
          return true;
        }
        return false;
      }

      @Override
      public Object previous() {
        if (this.hasPrevious()) {
          return names[--index];
        }
        return null;
      }

      @Override
      public boolean hasPrevious() {
        if (index <= 0) {
          return false;
        }
        return true;
      }

      @Override
      public void setLast() {
        index = names.length - 1;
      }
    };
  }
}
