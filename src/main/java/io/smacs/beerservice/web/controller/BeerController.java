package io.smacs.beerservice.web.controller;

import io.smacs.beerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author MGR on 19-01-2022
 */
@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @GetMapping("{/beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<BeerDto> saveBeer(@RequestBody BeerDto beerDto) {
//        todo impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("{/beerId}")
    public ResponseEntity<BeerDto> updateBeer(@PathVariable("beerId") UUID beerId,@RequestBody BeerDto beerDto) {
//        todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
