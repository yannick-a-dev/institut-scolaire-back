package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Etudiant;
import com.institutscolaire.gestioninstitutscolaire.model.ListEtudiant;

public interface EtudiantService {

	int nbre();

	int max();

	List<Etudiant> getAll();

	Optional<ListEtudiant> findById(String code);

}
