package com.bookstore.mapper;

import com.bookstore.dto.CustomerDTO;
import com.bookstore.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer toEntity(CustomerDTO customerDTO);
    CustomerDTO toDTO(Customer customer);
}
