package it.giorgio.terzo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.terzo.entity.Foto;

@Repository
public interface FotoRepository extends JpaRepository<Foto, Integer> {

}
