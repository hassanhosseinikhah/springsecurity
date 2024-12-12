package com.example.springsecurity.service;

import com.example.sprignsec.entity.Customer;
import com.example.sprignsec.mapper.CustomerMapper;
import com.example.sprignsec.model.CustomerModel;
import com.example.sprignsec.repository.CustomerRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepo customerRepo, CustomerMapper customerMapper) {
        this.customerRepo = customerRepo;
        this.customerMapper = customerMapper;
    }

    public CustomerModel createCustomer(CustomerModel customer) {
        Customer entity = customerMapper.modelToEntity(customer);
        return  customerMapper.entityToModel(customerRepo.save(entity));
    }
}
