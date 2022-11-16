package com.inspire17.tutorial.lld.strucuralpattern.proxy.dbcontrol;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataBaseExecutorImpl implements DataBaseExecutor {

  @Override
  public void create(User user) {
    DataBase.getDatabase().getUsers().add(user);
  }

  @Override
  public List<User> read(String uid) {
    return DataBase.getDatabase().getUsers().stream()
        .filter(e -> e.getId().equals(uid))
        .collect(Collectors.toList());
  }

  @Override
  public void update(User user) {
    DataBase.getDatabase().getUsers().stream()
        .filter(e -> e.getId().equals(user.getId()))
        .map(e -> user);
  }

  @Override
  public void delete(User user) {
    List<User> toRemove = new ArrayList<>();
    DataBase.getDatabase().getUsers().stream()
        .filter(e -> e.getId().equals(user.getId()))
        .forEach(e -> toRemove.add(e));
    DataBase.getDatabase().getUsers().removeAll(toRemove);
  }

  @Override
  public List<User> getAll() {
    return DataBase.getDatabase().getUsers();
  }

  @Override
  public String print() {
    return DataBase.getDatabase().toString();
  }
}
