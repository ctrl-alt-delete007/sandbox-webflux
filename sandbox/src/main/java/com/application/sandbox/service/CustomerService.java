package com.application.sandbox.service;

import com.application.sandbox.dto.CustomerDto;
import com.application.sandbox.mapper.ICustomerMapper;
import com.application.sandbox.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    ICustomerMapper customerMapper;

    @Autowired
    CustomerRepository customerRepository;

    public Mono<CustomerDto> getCustomer(String phoneNumber) {
        return customerRepository.findByPhoneNumber(phoneNumber)
                .map(customerEntity -> customerMapper.toDTO((customerEntity)));
    }

    public Flux<CustomerDto> getAllCustomers() {
        return customerRepository.getAllCustomers()
                .map(customerEntity -> customerMapper.toDTO(customerEntity));
    }
}
