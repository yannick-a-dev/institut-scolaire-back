package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;

import com.institutscolaire.gestioninstitutscolaire.model.Lreglement;

public interface LreglementService {

	List<Lreglement> getAll();

	List<Lreglement> findByNumero(int numero);

}
