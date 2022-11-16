package com.inspire17.tutorial.lld.creationalpattern.singleton;

public class ThreadSafeDataBank {
  private static ThreadSafeDataBank threadSafeDataBank;
  private String status;

  private ThreadSafeDataBank() {
    status = "Ready start Thread safe Data bank";
  }

  public static synchronized ThreadSafeDataBank getInstance(Thread t) {
    System.out.println(t.getName());
    if (threadSafeDataBank == null) {
      System.out.println(t.getName());
      threadSafeDataBank = new ThreadSafeDataBank();
    }
    return threadSafeDataBank;
  }

  public String getStatus() {
    return status;
  }
}
