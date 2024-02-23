package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IDetailContractDAO;
import com.example.winz_fast.dao.impl.DetailContractDAO;
import com.example.winz_fast.model.DetailContract;
import com.example.winz_fast.service.IDetailContractService;

import java.util.List;

public class DetailContractService implements IDetailContractService {
    IDetailContractDAO detailContractDAO = new DetailContractDAO();
    @Override
    public List<DetailContract> getAllDetailContract() {
        return detailContractDAO.getAllDetailContract();
    }
}
