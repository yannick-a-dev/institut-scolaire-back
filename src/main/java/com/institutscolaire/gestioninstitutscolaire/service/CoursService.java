package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Cours;

public interface CoursService {

	List<Cours> getALl();

	Optional<Cours> findById(Long id);

	Long save(Cours cours);

	void update(Long id, Cours cours);

	void delete(Long id);

}
