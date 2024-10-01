package org.cardanofoundation.bolnisiaggregator.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WineryData {
    String publicKey;
    List<Lot> lots;
    boolean pkKeyVerified;
}
