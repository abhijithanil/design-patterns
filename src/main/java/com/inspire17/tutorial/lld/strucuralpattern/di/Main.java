package com.inspire17.tutorial.lld.strucuralpattern.di;

public class Main {

  public static void main(String[] args) {

    Main main = new Main();
    main.send();
  }

  public void send() {
    TextMessageServiceInjector textMessageServiceInjector = new TextMessageServiceInjector();
    Consumer textMessageConsumer = textMessageServiceInjector.getConsumer();
    Consumer emailService = new EmailServiceInjector().getConsumer();
    textMessageConsumer.sendMessage("Abhijith", "Anil");
    emailService.sendMessage("Abhijith", "Arjun");
  }
}
