package com.inspire17.tutorial.lld.strucuralpattern.proxy.caching;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

public class Client {
  public static void main(String[] args) throws Exception {
    User u1 = new User.Builder().id("1").firstName("Abhijith").build();
    User u2 = new User.Builder().id("1").firstName("Ajay").build();
    User u3 = new User.Builder().id("2").firstName("Sam").build();
    IAccountRepository accountRepository = new ProxyAccountRepository();
    String u1ID = accountRepository.addUser(u1, false);
    System.out.println(u1ID);
    String u2ID = accountRepository.addUser(u2, false);
    System.out.println(accountRepository.getUser(u2ID, false).getFirstName());
    String u3ID = accountRepository.addUser(u2, true);
    System.out.println(accountRepository.getUser(u3ID, true).getFirstName());
    String u4ID = accountRepository.addUser(u1, true);
    System.out.println(accountRepository.getUser(u4ID, true).getFirstName());
    String u5ID = accountRepository.addUser(u3, true);
  }
}
