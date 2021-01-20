package dev.manuel.msscbrewery.model.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

  @Null
  private UUID beerId;

  @NotBlank
  private String beerName;

  @NotBlank
  private String beerStyle;

  @Positive
  private Long upc;

}
