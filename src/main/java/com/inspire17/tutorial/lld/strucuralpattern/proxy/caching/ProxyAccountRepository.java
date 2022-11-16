package com.inspire17.tutorial.lld.strucuralpattern.proxy.caching;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

public class ProxyAccountRepository implements IAccountRepository {
  private IAccountRepository accountRepository = new AccountRepository();

  @Override
  public User getUser(String userId, boolean shouldRefresh) {
    return accountRepository.getUser(userId, shouldRefresh);
  }

  @Override
  public String addUser(User user, boolean shouldRefresh) throws Exception {
    if (user.getFirstName().startsWith("S")) {
      throw new Exception("User with name starting with S not allowed");
    }
    return accountRepository.addUser(user, shouldRefresh);
  }
}
