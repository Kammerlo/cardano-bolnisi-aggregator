package org.cardanofoundation.bolnisiaggregator.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cid {

    @JsonProperty("number_of_bottles")
    private int numberOfBottles;

    @JsonProperty("lot_number")
    private String lotNumber;

}
