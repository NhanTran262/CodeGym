package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.ICustomerTypeDAO;
import com.example.winz_fast.dao.impl.CustomerTypeDAO;
import com.example.winz_fast.model.person.CustomerType;
import com.example.winz_fast.service.ICustomerTypeService;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {
    ICustomerTypeDAO customerTypeDAO = new CustomerTypeDAO();

    @Override
    public List<CustomerType> getALLCustomerType() {
        return customerTypeDAO.getAllCustomerType();
    }
}
