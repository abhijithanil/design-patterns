package com.inspire17.tutorial.lld.strucuralpattern.proxy.caching;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

public interface IAccountRepository {
  User getUser(String userId, boolean shouldRefresh);

  String addUser(User user, boolean shouldRefresh) throws Exception;
}
