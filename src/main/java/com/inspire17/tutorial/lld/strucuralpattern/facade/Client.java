package com.inspire17.tutorial.lld.strucuralpattern.facade;

public class Client {

  public static void main(String[] args) {
    MessageBroker messageBroker = new MessageBrokerImpl();
    messageBroker.sendEmailInvitation();
    messageBroker.sendTextInvitation();
  }
}
