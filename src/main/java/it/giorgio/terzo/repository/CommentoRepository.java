package it.giorgio.terzo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.terzo.entity.Commento;

@Repository
public interface CommentoRepository extends JpaRepository<Commento, Integer> {

}
