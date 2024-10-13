package com.codegym.cms.service.customer;

import com.codegym.cms.dto.CustomerDto;
import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.service.IGeneralService;

import java.util.List;

public interface ICustomerService extends IGeneralService<Customer> {
    List<CustomerDto> findCustomerNames();
    Iterable<Customer> findAllByProvince(Province province);
}
