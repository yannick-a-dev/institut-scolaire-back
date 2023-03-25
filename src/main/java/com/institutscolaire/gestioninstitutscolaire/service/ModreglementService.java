package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Modreglement;

public interface ModreglementService {

	List<Modreglement> getAll();

	Optional<Modreglement> findByCode(String id);

	Long save(Modreglement categorie);

	void update(String code, Modreglement categorie);

	void delete(String code);

}
