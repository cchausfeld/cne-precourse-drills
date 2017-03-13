package com.galvanize;

import java.util.List;
import java.util.ArrayList;

class Business implements Addressable {
  private final String name;
  private final List<Address> addresses;

  public Business(String startName) {
    name = startName;
    addresses = new ArrayList();
  }

  public String getName() {
    return name;
  }

  public void addAddress(Address newAddress) {
    addresses.add(newAddress);
  }

  public List<Address> getAddresses() {
    return addresses;
  }
}
