package com.codegym.cms.service.customer;

import com.codegym.cms.dto.CustomerListDto;
import com.codegym.cms.model.Customer;
import com.codegym.cms.service.IGeneralService;

import java.util.List;

public interface ICustomerService extends IGeneralService<Customer> {

    List<CustomerListDto> findCustomersWithModelMapper();

    List<CustomerListDto> findCustomersWithBeanUtils();
}
