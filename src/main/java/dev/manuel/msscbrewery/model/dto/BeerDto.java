package dev.manuel.msscbrewery.model.dto;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

  private UUID beerId;
  private String beerName;
  private String beerStyle;
  private Long upc;

}
