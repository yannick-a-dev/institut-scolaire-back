package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.TypePaiement;

public interface TypepaiementService {

	Optional<TypePaiement> findByCode(String id);

	List<TypePaiement> getAll();

	int max();

	int nbre();

}
