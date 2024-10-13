package com.codegym.cms.service.customer;

import com.codegym.cms.converter.CustomerConverter;
import com.codegym.cms.dto.CustomerDto;
import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerDto> findAllByProvince(Province province) {
        Iterable<Customer> customers = customerRepository.findAllByProvince(province);
        List<Customer> customerList = StreamSupport.stream(customers.spliterator(),false)
                                                   .collect(Collectors.toList());
        List<CustomerDto> customerDtoList = customerList.stream()
                                                        .map(customer -> CustomerConverter.convertEntityToDto(customer))
                                                        .collect(Collectors.toList());
        return customerDtoList;
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(firstname, pageable);
    }
}
