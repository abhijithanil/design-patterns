package com.inspire17.tutorial.lld.strucuralpattern.di;

public class TextMessageService implements MessagingService {
  @Override
  public boolean sendMessage(String from, String to) {
    System.out.println("Sending text message from :" + from + " to: " + to);
    return true;
  }
}
