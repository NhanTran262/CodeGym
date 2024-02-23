package com.example.winz_fast.dao;

import com.example.winz_fast.model.Contract;

import java.util.List;

public interface IContractDAO {
    List<Contract> getAllContract();

    boolean add(Contract contract);

    boolean edit(Contract contract);

    boolean remove(int id);

    boolean getContractById(int id);
}
