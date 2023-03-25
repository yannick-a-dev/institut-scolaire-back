package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Banque;

public interface BanqueService {

	List<Banque> getAll();

	Optional<Banque> findById(Long id);

	Long save(Banque categorie);

	void update(String code, Banque categorie);

	void delete(Long id);

}
