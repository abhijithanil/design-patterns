package com.inspire17.tutorial.lld.strucuralpattern.proxy.dbcontrol;

import com.inspire17.tutorial.lld.creationalpattern.builder.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
  private static final DataBase dataBase = new DataBase();
  List<User> db = new ArrayList<>();

  private DataBase() {
    initializeDb();
  }

  public static DataBase getDatabase() {
    return dataBase;
  }

  public List<User> getUsers() {
    return db;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (User u : getUsers()) {
      sb.append(u.toString()).append("\n");
    }
    return sb.toString();
  }

  private void initializeDb() {
    User u1 = new User.Builder().id("uid1").firstName("Abhijith").build();
    User u2 = new User.Builder().id("uid2").firstName("Anagha").build();
    User u3 = new User.Builder().id("uid3").firstName("Arjun").build();
    User u4 = new User.Builder().id("uid3").firstName("Arjun").build();
    db.add(u1);
    db.add(u2);
    db.add(u3);
    db.add(u4);
  }
}
