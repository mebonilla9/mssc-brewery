package dev.manuel.msscbrewery.business.service.beer;

import dev.manuel.msscbrewery.model.dto.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
  @Override
  public BeerDto getBeerById(UUID beerId) {
    return BeerDto.builder()
        .id(UUID.randomUUID())
        .beerName("Galaxy Cat")
        .beerStyle("Pale Ale")
        .build();
  }
}
