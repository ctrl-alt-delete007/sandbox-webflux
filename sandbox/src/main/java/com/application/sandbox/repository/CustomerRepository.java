package com.application.sandbox.repository;

import com.application.sandbox.dto.CustomerDto;
import com.application.sandbox.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class CustomerRepository extends BaseJpaRepository {
    @Autowired
    private CustomerJpaRepository repository;

    public Mono<Customer> findByPhoneNumber(String phoneNumber) {
        return monoFromBlocking(() -> repository.findByPhoneNumber(phoneNumber));
    }

    public Flux<Customer> getAllCustomers() {
        return fluxFromBlocking(() -> repository.findAll());
    }
}
