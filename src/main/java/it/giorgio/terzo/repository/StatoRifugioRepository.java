package it.giorgio.terzo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.terzo.entity.StatoRifugio;

@Repository
public interface StatoRifugioRepository extends JpaRepository<StatoRifugio, Integer> {

}
