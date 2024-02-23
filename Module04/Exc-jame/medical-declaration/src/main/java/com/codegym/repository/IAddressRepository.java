package com.codegym.repository;

import com.codegym.model.Address;

import java.util.List;

public interface IAddressRepository {
    List<Address> getAll();

    Address getById(int id);
}
