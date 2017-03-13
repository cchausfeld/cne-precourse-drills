package com.galvanize;

import java.util.List;

interface Addressable {

  public String getName();

  public void addAddress(Address newAddress);

  public List<Address> getAddresses();
}
