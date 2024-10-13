package com.codegym.cms.converter;

import com.codegym.cms.dto.CustomerDto;
import com.codegym.cms.model.Customer;

public interface ICustomerConverter {

    CustomerDto entityToDto(Customer entity);

    Customer dtoToEntity(CustomerDto dto);
}
