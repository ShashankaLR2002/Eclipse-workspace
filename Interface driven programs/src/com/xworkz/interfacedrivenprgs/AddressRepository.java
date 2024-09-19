package com.xworkz.interfacedrivenprgs;

public interface AddressRepository {
    boolean save();
    int update();
    void delete();
    String read();
}
