package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    @Query(nativeQuery = false, value = "select c from Customer c where c.isActive = true")
//    @Query(nativeQuery = true, value = "select * from customers c where c.is_active = true")
    List<Customer> findAllByIsActiveIsTrue();

    @Modifying
    @Query("update Customer c set c.isActive = false where c.id = :customerId")
    void softDeleteById(@Param("customerId") Long customerId);
    Iterable<Customer> findAllByProvince(Province province);
}
