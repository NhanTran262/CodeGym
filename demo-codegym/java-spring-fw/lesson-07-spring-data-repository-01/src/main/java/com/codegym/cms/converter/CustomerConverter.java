package com.codegym.cms.converter;

import com.codegym.cms.dto.CustomerDto;
import com.codegym.cms.model.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter implements ICustomerConverter {

    public CustomerDto entityToDto(Customer entity) {
        CustomerDto dto = new CustomerDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public Customer dtoToEntity(CustomerDto dto) {
        Customer entity = new Customer();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
