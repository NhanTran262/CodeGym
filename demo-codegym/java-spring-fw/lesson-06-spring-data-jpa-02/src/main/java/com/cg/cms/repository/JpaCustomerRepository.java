package com.cg.cms.repository;

import com.cg.cms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaCustomerRepository extends JpaRepository<Customer, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM customers WHERE firstName like '%' :firstName '%'")
    List<Customer> findCustomersByFirstName(@Param("firstName") String firstName);
}
