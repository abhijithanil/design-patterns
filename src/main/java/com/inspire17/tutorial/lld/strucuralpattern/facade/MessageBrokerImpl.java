package com.inspire17.tutorial.lld.strucuralpattern.facade;

import com.inspire17.tutorial.lld.strucuralpattern.di.EmailService;
import com.inspire17.tutorial.lld.strucuralpattern.di.TextMessageService;

public class MessageBrokerImpl implements MessageBroker {
  private EmailService emailService;
  private TextMessageService textMessageService;

  public MessageBrokerImpl() {
    emailService = new EmailService();
    textMessageService = new TextMessageService();
  }

  public void sendEmailInvitation() {
    emailService.sendMessage("Abhijith", "Anil");
    emailService.sendMessage("Abhijith", "Anagha");
    emailService.sendMessage("Abhijith", "Arjun");
  }

  public void sendTextInvitation() {
    textMessageService.sendMessage("Abhijith", "Anu");
    textMessageService.sendMessage("Abhijith", "Mini");
    textMessageService.sendMessage("Abhijith", "Anil");
  }
}
