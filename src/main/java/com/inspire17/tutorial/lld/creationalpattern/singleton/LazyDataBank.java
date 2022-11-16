package com.inspire17.tutorial.lld.creationalpattern.singleton;

public class LazyDataBank {
  private static LazyDataBank lazyDataBank;
  private String status;

  private LazyDataBank() {
    status = "Ready start Lazy Data bank";
  }

  public static LazyDataBank getInstance() {
    if (lazyDataBank == null) {
      lazyDataBank = new LazyDataBank();
    }
    return lazyDataBank;
  }

  public String getStatus() {
    return status;
  }
}
