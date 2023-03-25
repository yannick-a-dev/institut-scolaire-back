package com.institutscolaire.gestioninstitutscolaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutscolaire.gestioninstitutscolaire.model.Etablissement;

public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {

}
