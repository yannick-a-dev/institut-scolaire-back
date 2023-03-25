package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Matiere;

public interface MatiereService {

	int nbre();

	int max();

	List<Matiere> getAll();

	Optional<Matiere> findById(Long id);

}
