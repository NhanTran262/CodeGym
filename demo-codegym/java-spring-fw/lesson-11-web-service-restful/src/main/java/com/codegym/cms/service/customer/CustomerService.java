package com.codegym.cms.service.customer;

import com.codegym.cms.dto.CustomerListDto;
import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.ICustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerListDto> findCustomersWithModelMapper() {
        return customerRepository.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, CustomerListDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<CustomerListDto> findCustomersWithBeanUtils() {
        return customerRepository.findAll()
                .stream()
                .map(entity -> {
                    CustomerListDto dto = new CustomerListDto();
                    BeanUtils.copyProperties(entity, dto);
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
