package com.inspire17.tutorial.lld.strucuralpattern.di;

public class TextMessageServiceInjector implements MessageServiceInjector {
  @Override
  public Consumer getConsumer() {
    return new ConsumerImpl(new TextMessageService());
  }
}
