package com.inspire17.tutorial.lld.strucuralpattern.di;

public class ConsumerImpl implements Consumer {
  private MessagingService messagingService;

  public ConsumerImpl(MessagingService service) {
    this.messagingService = service;
  }

  @Override
  public boolean sendMessage(String from, String to) {
    return messagingService.sendMessage(from, to);
  }
}
