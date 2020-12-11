package dev.manuel.msscbrewery.business.service.beer;

import dev.manuel.msscbrewery.model.dto.BeerDto;

import java.util.UUID;

public interface BeerService {

  BeerDto getBeerById(UUID beerId);

}
