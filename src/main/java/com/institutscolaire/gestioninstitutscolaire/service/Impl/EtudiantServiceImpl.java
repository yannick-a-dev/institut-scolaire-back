package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.Etudiant;
import com.institutscolaire.gestioninstitutscolaire.model.ListEtudiant;
import com.institutscolaire.gestioninstitutscolaire.service.EtudiantService;

@Service
public class EtudiantServiceImpl implements EtudiantService {

	@Override
	public int nbre() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int max() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Etudiant> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ListEtudiant> findById(String code) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
