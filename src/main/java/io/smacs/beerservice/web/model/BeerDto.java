package io.smacs.beerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author MGR on 18-01-2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private String beerName;
    private Long upc;
    private BigDecimal price;
    private Integer version;
    private Integer quantityOnHand;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private BeerStyle beerStyle;

}
