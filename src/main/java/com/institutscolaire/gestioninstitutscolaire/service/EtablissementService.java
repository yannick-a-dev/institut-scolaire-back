package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Etablissement;

public interface EtablissementService {

	int nbre();

	int max();

	List<Etablissement> getAll();

	Optional<Etablissement> findById(Long id);

}
