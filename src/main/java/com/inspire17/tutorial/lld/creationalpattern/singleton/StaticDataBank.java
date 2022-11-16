package com.inspire17.tutorial.lld.creationalpattern.singleton;

public class StaticDataBank {
  private static StaticDataBank instance;

  static {
    instance = new StaticDataBank();
  }

  private final String status;

  private StaticDataBank() {
    status = "Ready start Static Data bank";
  }

  public static StaticDataBank getInstance() {
    return instance;
  }

  public String getStatus() {
    return status;
  }
}
