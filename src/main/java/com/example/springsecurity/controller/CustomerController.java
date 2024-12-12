package com.example.springsecurity.controller;

import com.example.sprignsec.model.CustomerModel;
import com.example.sprignsec.service.CustomerService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService;
    private final PasswordEncoder passwordEncoder;

    public CustomerController(CustomerService customerService, PasswordEncoder passwordEncoder) {
        this.customerService = customerService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/create")
    public CustomerModel createCustomer(@RequestBody CustomerModel customer) {
        passwordEncoder.encode(customer.getPassword());
        return customerService.createCustomer(customer);
    }
}
