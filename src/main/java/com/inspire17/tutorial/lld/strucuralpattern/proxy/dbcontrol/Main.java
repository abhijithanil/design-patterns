package com.inspire17.tutorial.lld.strucuralpattern.proxy.dbcontrol;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

import java.util.List;

public class Main {
  public static void main(String[] args) throws UnauthorisedException {
    doAdminOperation();
    doUserOperations();
  }

  private static void doUserOperations() {
    DataBaseExecutor dataBaseExecutor = new DataBaseExecutorImplProxy(AccessRights.USER);
    List<User> users = dataBaseExecutor.read("uid6");
    for (User u : users) {
      System.out.println(u.toString());
    }
    printDelimiter(3);
    User u6 = new User.Builder().id("uid6").firstName("Anjana").build();

    try {
      dataBaseExecutor.create(u6);
    } catch (UnauthorisedException e) {
      System.out.println(e.getMessage());
    }
  }

  private static void doAdminOperation() throws UnauthorisedException {
    DataBaseExecutor dataBaseExecutor = new DataBaseExecutorImplProxy(AccessRights.ADMIN);
    User u5 = new User.Builder().id("uid6").firstName("Anjana").build();
    dataBaseExecutor.create(u5);
    System.out.println(dataBaseExecutor.print());

    printDelimiter(3);
    List<User> users = dataBaseExecutor.read("uid3");
    if (users.size() > 0) {
      dataBaseExecutor.delete(users.get(0));
    }
    System.out.println(dataBaseExecutor.print());
    printDelimiter(3);
    User u6 = new User.Builder().id("uid6").firstName("Anjana Anil").build();
    dataBaseExecutor.update(u6);
    System.out.println(dataBaseExecutor.print());
    printDelimiter(3);
  }

  private static void printDelimiter(int i) {
    for (int j = 0; j < i; j++) {
      System.out.println("------------------------------------------------------------");
    }
  }
}
