package com.inspire17.tutorial.lld.strucuralpattern.proxy;

public class Client {
  public static void main(String[] args) {
    Internet internet = new ProxyInternet();
    try {
      internet.connectTo("google.com");
      internet.connectTo("lol.com");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
