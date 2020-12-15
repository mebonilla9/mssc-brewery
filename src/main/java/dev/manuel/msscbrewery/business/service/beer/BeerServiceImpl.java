package dev.manuel.msscbrewery.business.service.beer;

import dev.manuel.msscbrewery.model.dto.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
  @Override
  public BeerDto getBeerById(UUID beerId) {
    return BeerDto.builder()
        .beerId(UUID.randomUUID())
        .beerName("Galaxy Cat")
        .beerStyle("Pale Ale")
        .build();
  }

  @Override
  public BeerDto saveNewBeer(BeerDto beerDto) {
    return BeerDto.builder()
        .beerId(UUID.randomUUID())
        .build();
  }

  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {
    //TODO Consider create business logic for this implementation.
  }

  @Override
  public void deleteById(UUID beerId) {
    //TODO Consider create business logic for this implentation.
  }
}
