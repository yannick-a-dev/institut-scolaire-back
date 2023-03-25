package com.institutscolaire.gestioninstitutscolaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutscolaire.gestioninstitutscolaire.model.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

}
