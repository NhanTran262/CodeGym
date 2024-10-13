package com.codegym.cms.converter;

import com.codegym.cms.dto.CustomerDto;
import com.codegym.cms.model.Customer;

public class CustomerConverter {

    public static CustomerDto convertEntityToDto(Customer entity) {
        return new CustomerDto(entity.getId(),
                                entity.getFirstName(),
                                entity.getLastName(),
                                entity.getProvince());
    }

    public static Customer convertDtoToEntity(CustomerDto dto) {
        return new Customer(dto.getId(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getProvince());
    }
}
