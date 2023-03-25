package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Domaine;

public interface DomaineService {

	int nbre();

	int max();

	List<Domaine> getAll();

	Optional<Domaine> findByCode(String id);

}
