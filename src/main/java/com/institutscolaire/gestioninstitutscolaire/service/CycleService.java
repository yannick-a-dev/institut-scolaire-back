package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Cycle;

public interface CycleService {

	int nbre();

	int max();

	List<Cycle> getAll();

	Optional<Cycle> findByCode(String id);

}
