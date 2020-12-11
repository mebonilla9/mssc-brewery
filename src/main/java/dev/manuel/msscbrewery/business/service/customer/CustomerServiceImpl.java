package dev.manuel.msscbrewery.business.service.customer;

import dev.manuel.msscbrewery.model.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerByid(UUID customerId) {
    return CustomerDto.builder()
        .customerId(UUID.randomUUID())
        .customerName("Manuel Ernesto Bonilla")
        .build();
  }
}
