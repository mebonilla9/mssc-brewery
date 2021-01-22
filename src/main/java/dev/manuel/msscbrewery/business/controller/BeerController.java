package dev.manuel.msscbrewery.business.controller;

import dev.manuel.msscbrewery.business.service.beer.BeerService;
import dev.manuel.msscbrewery.model.dto.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

  private final BeerService beerService;

  public BeerController(BeerService beerService) {
    this.beerService = beerService;
  }

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeer(@NotNull @PathVariable("beerId") UUID beerId) {
    return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity handlePost(@NotNull @Valid @RequestBody BeerDto beerDto) {
    BeerDto savedDto = beerService.saveNewBeer(beerDto);

    HttpHeaders headers = new HttpHeaders();
    headers.add("location", "/api/v1/beer/" + savedDto.getBeerId().toString());
    return new ResponseEntity(headers, HttpStatus.CREATED);
  }

  @PutMapping("/{beerId}")
  public ResponseEntity handleUpdate(
      @NotNull @PathVariable("beerId") UUID beerId,
      @NotNull @Valid @RequestBody BeerDto beerDto) {
    beerService.updateBeer(beerId, beerDto);
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping("/{beerId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteBeer(@NotNull @PathVariable("beerId") UUID beerId) {
    beerService.deleteById(beerId);
  }
}
