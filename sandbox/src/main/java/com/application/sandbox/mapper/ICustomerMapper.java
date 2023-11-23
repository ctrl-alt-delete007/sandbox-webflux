package com.application.sandbox.mapper;

import com.application.sandbox.dto.CustomerDto;
import com.application.sandbox.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ICustomerMapper {
    ICustomerMapper instance = Mappers.getMapper(ICustomerMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "customerName", target = "customerName")
    @Mapping(source = "customerLastName", target = "customerLastName")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    CustomerDto toDTO(Customer customer);
}
