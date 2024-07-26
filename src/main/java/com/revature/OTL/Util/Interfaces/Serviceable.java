package com.revature.OTL.Util.Interfaces;

import java.util.List;
public interface Serviceable<O> {
    O create(O newObject);
    List<O> findAll();
    O findById(int number);
    void deleteById(int number);
}