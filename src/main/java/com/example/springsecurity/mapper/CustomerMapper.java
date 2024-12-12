package com.example.springsecurity.mapper;

import com.example.sprignsec.entity.Customer;
import com.example.sprignsec.model.CustomerModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerModel entityToModel(Customer customer);
    Customer modelToEntity(CustomerModel customerModel);
}
