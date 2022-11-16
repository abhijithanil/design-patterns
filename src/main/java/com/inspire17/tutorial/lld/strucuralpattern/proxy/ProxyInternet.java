package com.inspire17.tutorial.lld.strucuralpattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
  private static List<String> allowedSites;

  static {
    allowedSites = new ArrayList<>();
    allowedSites.add("google.com");
    allowedSites.add("inspire17.com");
    allowedSites.add("facebook.com");
    allowedSites.add("healtheintent.com");
  }

  private Internet internet = new RealInternet();

  @Override
  public void connectTo(String hostAddress) throws Exception {
    if (allowedSites.contains(hostAddress.toLowerCase())) {
      internet.connectTo(hostAddress);
    } else {
      throw new Exception("Access denied");
    }
  }
}
