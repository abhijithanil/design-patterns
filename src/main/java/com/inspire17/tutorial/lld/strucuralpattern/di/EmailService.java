package com.inspire17.tutorial.lld.strucuralpattern.di;

public class EmailService implements MessagingService {
  @Override
  public boolean sendMessage(String from, String to) {
    System.out.println("Sending email from :" + from + " to: " + to);
    return true;
  }
}
