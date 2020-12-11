package dev.manuel.msscbrewery.business.service.customer;

import dev.manuel.msscbrewery.model.dto.CustomerDto;

import java.util.UUID;

public interface CustomerService {

  CustomerDto getCustomerByid(UUID customerId);
}
