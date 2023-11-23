package com.application.sandbox.controller;

import com.application.sandbox.dto.CustomerDto;
import com.application.sandbox.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/sandbox")
public class SandboxController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/{phoneNumber}")
    public ResponseEntity<Mono<CustomerDto>> findCustomerByPhoneNumber(@PathVariable String phoneNumber) {
        Mono<CustomerDto> customer = customerService.getCustomer(phoneNumber);
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/")
    public ResponseEntity<Flux<CustomerDto>> getAllCustomers() {
        Flux<CustomerDto> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }
}
