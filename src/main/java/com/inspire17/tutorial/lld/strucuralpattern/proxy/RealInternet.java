package com.inspire17.tutorial.lld.strucuralpattern.proxy;

public class RealInternet implements Internet {
  @Override
  public void connectTo(String hostAddress) {
    System.out.println("Connected to " + hostAddress);
  }
}
