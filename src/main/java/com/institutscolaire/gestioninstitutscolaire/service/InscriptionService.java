package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Inscription;

public interface InscriptionService {

	List<Inscription> getAll();

	Optional<Inscription> findById(Long id);

	Long save(Inscription inscription);

	void update(Long id, Inscription inscription);

}
