package com.codegym.cms.service.customer;

import com.codegym.cms.converter.ICustomerConverter;
import com.codegym.cms.dto.CustomerDto;
import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.repository.ICustomerRepository;
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
    private ICustomerConverter customerConverter;

    @Override
    public Iterable<Customer> findAll() {
//        return customerRepository.findAll();//using with hard remove
        return customerRepository.findAllByIsActiveIsTrue();//using with soft remove
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customer.setActive(true);
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);//hard remove
//        customerRepository.softDeleteById(id);//soft remove
    }

    @Override
    public List<CustomerDto> findCustomerNames() {
        List<Customer> customers = customerRepository.findAllByIsActiveIsTrue();
        return customers.stream()
                .map(entity -> customerConverter.entityToDto(entity))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}
