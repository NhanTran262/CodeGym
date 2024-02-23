package com.example.winz_fast.service;

import com.example.winz_fast.model.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> getAllContract();

    boolean add(Contract contract);

    boolean edit(Contract contract);

    boolean remove(int id);

    boolean getContractById(int id);
}
