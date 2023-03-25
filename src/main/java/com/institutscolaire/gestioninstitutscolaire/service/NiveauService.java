package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Niveau;

public interface NiveauService {

	int max();

	int nbre();

	List<Niveau> getAll();

	Optional<Niveau> findByCode(String id);

}
