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

  @Override
  public CustomerDto saveNewCustomer(CustomerDto beerDto) {
    return CustomerDto.builder()
        .customerId(UUID.randomUUID())
        .build();
  }

  @Override
  public void updateCustomer(UUID customerId, CustomerDto beerDto) {
    //TODO Consider create business logic for this implementation.
  }

  @Override
  public void deleteById(UUID customerId) {
    //TODO Consider create business logic for this implementation.
  }
}
