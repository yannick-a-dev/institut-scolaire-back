package com.institutscolaire.gestioninstitutscolaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutscolaire.gestioninstitutscolaire.model.Reglement;

public interface ReglementRepository extends JpaRepository<Reglement, Long> {

}
