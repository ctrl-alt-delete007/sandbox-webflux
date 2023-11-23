package com.application.sandbox.mapper;

import com.application.sandbox.dto.CustomerDto;
import com.application.sandbox.model.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-23T08:12:38-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class ICustomerMapperImpl implements ICustomerMapper {

    @Override
    public CustomerDto toDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto.CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.id( customer.getId() );
        customerDto.customerName( customer.getCustomerName() );
        customerDto.customerLastName( customer.getCustomerLastName() );
        customerDto.phoneNumber( customer.getPhoneNumber() );

        return customerDto.build();
    }
}
