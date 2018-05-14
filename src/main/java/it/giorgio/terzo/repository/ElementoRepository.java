package it.giorgio.terzo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.terzo.entity.Elemento;

@Repository
public interface ElementoRepository extends JpaRepository<Elemento, Integer> {

}
