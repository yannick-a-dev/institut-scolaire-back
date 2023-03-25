package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Nationalite;

public interface NationaliteService {

	List<Nationalite> getAll();

	Optional<Nationalite> findByCode(String id);

	Long save(Nationalite categorie);

	void update(String code, Nationalite categorie);

}
