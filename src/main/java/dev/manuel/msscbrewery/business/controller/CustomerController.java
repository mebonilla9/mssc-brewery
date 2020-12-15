package dev.manuel.msscbrewery.business.controller;

import dev.manuel.msscbrewery.business.service.customer.CustomerService;
import dev.manuel.msscbrewery.model.dto.BeerDto;
import dev.manuel.msscbrewery.model.dto.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/{customerId}")
  public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {
    return new ResponseEntity<>(customerService.getCustomerByid(customerId), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity handlePost(@RequestBody CustomerDto beerDto) {
    CustomerDto savedDto = customerService.saveNewCustomer(beerDto);

    HttpHeaders headers = new HttpHeaders();
    headers.add("location", "/api/v1/customer/" + savedDto.getCustomerId().toString());
    return new ResponseEntity(headers, HttpStatus.CREATED);
  }

  @PutMapping("/{beerId}")
  public ResponseEntity handleUpdate(@PathVariable("beerId") UUID customerId, CustomerDto beerDto) {
    customerService.updateCustomer(customerId, beerDto);
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping("/{beerId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteBeer(@PathVariable("customerId") UUID customerId) {
    customerService.deleteById(customerId);
  }
}
