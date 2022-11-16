package com.inspire17.tutorial.lld.strucuralpattern.proxy.dbcontrol;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

import java.util.ArrayList;
import java.util.List;

public class DataBaseExecutorImplProxy implements DataBaseExecutor {
  private final AccessRights accessRights;
  private DataBaseExecutor dataBaseExecutor;

  public DataBaseExecutorImplProxy(AccessRights accessRights) {
    this.accessRights = accessRights;
    dataBaseExecutor = new DataBaseExecutorImpl();
  }

  @Override
  public void create(User user) throws UnauthorisedException {
    if (accessRights.equals(AccessRights.ADMIN)) {
      dataBaseExecutor.create(user);
    } else {
      throw new UnauthorisedException();
    }
  }

  @Override
  public List<User> read(String uid) {
    return dataBaseExecutor.read(uid);
  }

  @Override
  public void update(User user) throws UnauthorisedException {
    if (accessRights.equals(AccessRights.ADMIN)) {
      dataBaseExecutor.update(user);
    } else {
      throw new UnauthorisedException();
    }
  }

  @Override
  public void delete(User user) throws UnauthorisedException {
    if (accessRights.equals(AccessRights.ADMIN)) {
      dataBaseExecutor.delete(user);
    } else {
      throw new UnauthorisedException();
    }
  }

  @Override
  public List<User> getAll() {
    if (accessRights.equals(AccessRights.USER)) {
      return dataBaseExecutor.getAll();
    }
    return new ArrayList<>();
  }

  @Override
  public String print() {
    return dataBaseExecutor.print();
  }
}
