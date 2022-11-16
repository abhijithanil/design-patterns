package com.inspire17.tutorial.lld.strucuralpattern.proxy.dbcontrol;

public class UnauthorisedException extends Exception {
  private final String message = "You do not have permission";

  @Override
  public String getMessage() {
    return message;
  }
}
