package com.cg.cms.service;

import com.cg.cms.model.Customer;
import com.cg.cms.repository.JpaCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService {
//    @Autowired
//    private ICustomerRepository customerRepository;

    @Autowired
    private JpaCustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

//    @Override
//    public boolean insertWithStoredProcedure(Customer customer) {
//        return customerRepository.insertWithStoredProcedure(customer);
//    }

    @Override
    public Customer saveByJpaRepository(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findCustomersByFirstName(String firstName) {
        return customerRepository.findCustomersByFirstName(firstName);
    }

}
