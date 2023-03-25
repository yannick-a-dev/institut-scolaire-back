package com.institutscolaire.gestioninstitutscolaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutscolaire.gestioninstitutscolaire.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
