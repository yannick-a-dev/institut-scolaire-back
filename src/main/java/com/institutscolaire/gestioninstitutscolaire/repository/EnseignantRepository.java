package com.institutscolaire.gestioninstitutscolaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutscolaire.gestioninstitutscolaire.model.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {

}
