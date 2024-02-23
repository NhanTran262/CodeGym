package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IContractDAO;
import com.example.winz_fast.dao.impl.ContractDAO;
import com.example.winz_fast.model.Contract;
import com.example.winz_fast.service.IContractService;

import java.util.List;

public class ContractService implements IContractService {
    IContractDAO contractDAO = new ContractDAO();
    @Override
    public List<Contract> getAllContract() {
        return contractDAO.getAllContract();
    }

    @Override
    public boolean add(Contract contract) {
        return false;
    }

    @Override
    public boolean edit(Contract contract) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public boolean getContractById(int id) {
        return false;
    }
}
