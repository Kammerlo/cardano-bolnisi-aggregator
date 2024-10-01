package org.cardanofoundation.bolnisiaggregator.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.cardanofoundation.bolnisiaggregator.model.entity.Winery;

import java.util.Optional;

public interface WineryRepository extends JpaRepository<Winery, Long> {

    @Query("SELECT COUNT(w) FROM Winery w")
    int countAll();

    Optional<Winery> findByWineryId(String wineryId);

}
