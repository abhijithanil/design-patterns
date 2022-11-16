package com.inspire17.tutorial.lld.creationalpattern.singleton;

public class EagerDataBank {

  public static final EagerDataBank INSTANCE = new EagerDataBank();
  private final String status;

  private EagerDataBank() {
    status = "Ready start Eager Data bank";
  }

  public String getStatus() {
    return status;
  }
}
