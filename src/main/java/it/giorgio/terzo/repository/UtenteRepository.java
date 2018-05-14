package it.giorgio.terzo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giorgio.terzo.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {

}
