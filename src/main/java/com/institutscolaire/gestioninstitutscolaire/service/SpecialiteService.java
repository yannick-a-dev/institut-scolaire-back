package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Specialite;

public interface SpecialiteService {

	int nbre();

	int max();

	List<Specialite> getAll();

	Optional<Specialite> findByCode(String id);

}
