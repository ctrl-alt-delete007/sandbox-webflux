package com.application.sandbox.repository;

import com.application.sandbox.dto.CustomerDto;
import com.application.sandbox.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface CustomerJpaRepository extends JpaRepository<Customer, UUID> {
    @Query(value = "select c from Customer c where c.phoneNumber = :phoneNumberValue")
    Customer findByPhoneNumber(@Param("phoneNumberValue") String phoneNumberValue);
}
