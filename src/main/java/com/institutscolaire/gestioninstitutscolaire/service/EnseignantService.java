package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;
import com.institutscolaire.gestioninstitutscolaire.model.Enseignant;

public interface EnseignantService {

	int nbre();

	int max();

	List<Enseignant> getAll();

	Optional<Enseignant> findByCode(Long id);

}
