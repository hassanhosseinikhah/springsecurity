package com.example.springsecurity.mapper;

import com.example.springsecurity.entity.Customer;
import com.example.springsecurity.model.CustomerModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerModel entityToModel(Customer customer);
    Customer modelToEntity(CustomerModel customerModel);
}
