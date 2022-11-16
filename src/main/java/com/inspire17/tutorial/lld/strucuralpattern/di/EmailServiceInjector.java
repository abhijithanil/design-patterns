package com.inspire17.tutorial.lld.strucuralpattern.di;

public class EmailServiceInjector implements MessageServiceInjector {
  @Override
  public Consumer getConsumer() {
    return new ConsumerImpl(new EmailService());
  }
}
