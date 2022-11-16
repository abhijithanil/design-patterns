package com.inspire17.tutorial.lld.strucuralpattern.proxy.caching;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

import java.util.HashMap;
import java.util.Map;

public class UserCache {
  public static final UserCache INSTANCE = new UserCache();
  private Map<String, User> cache;

  private UserCache() {
    cache = new HashMap<>();
  }

  public void add(String id, User user, boolean refresh) {
    if (cache.keySet().contains(id) && refresh) {
      System.out.println("refreshing before adding");
      cache.put(id, user);
    } else if (!cache.keySet().contains(id)) {
      System.out.println("adding new");
      cache.put(id, user);
    }
  }

  public User getUser(String id, boolean refresh) {
    User user = cache.get(id);
    if (refresh) {
      cache.remove(id);
    }
    return user;
  }
}
