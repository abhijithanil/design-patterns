package com.inspire17.tutorial.lld.strucuralpattern.proxy.dbcontrol;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

import java.util.List;

public interface DataBaseExecutor {
  void create(User user) throws UnauthorisedException;

  List<User> read(String uid);

  void update(User user) throws UnauthorisedException;

  void delete(User user) throws UnauthorisedException;

  List<User> getAll();

  String print();
}
