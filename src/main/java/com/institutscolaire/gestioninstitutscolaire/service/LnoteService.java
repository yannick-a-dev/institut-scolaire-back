package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;

import com.institutscolaire.gestioninstitutscolaire.model.Lnote;

public interface LnoteService {

	List<Lnote> getAll();

	List<Lnote> findByNumero(int numero);

}
