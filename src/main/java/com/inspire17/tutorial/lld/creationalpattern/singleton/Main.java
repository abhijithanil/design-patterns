package com.inspire17.tutorial.lld.creationalpattern.singleton;

public class Main extends Thread {

  public static void main(String[] args) {
    System.out.println(EagerDataBank.INSTANCE.getStatus());
    System.out.println(LazyDataBank.getInstance().getStatus());
    System.out.println(StaticDataBank.getInstance().getStatus());
    Main m = new Main();
    Thread t1 = new Thread(m, "First Thread");
    Thread t2 = new Thread(m, "Second Thread");
    t2.start();
    t1.start();
  }

  @Override
  public void run() {
    System.out.println(ThreadSafeDataBank.getInstance(Thread.currentThread()).getStatus());
  }
}
