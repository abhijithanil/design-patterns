package com.inspire17.tutorial.lld.strucuralpattern.proxy.caching;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

public class AccountRepository implements IAccountRepository {
  @Override
  public User getUser(String userId, boolean shouldRefresh) {
    return UserCache.INSTANCE.getUser(userId, shouldRefresh);
  }

  @Override
  public String addUser(User user, boolean shouldRefresh) {
    UserCache.INSTANCE.add(user.getId(), user, shouldRefresh);
    return user.getId();
  }
}
