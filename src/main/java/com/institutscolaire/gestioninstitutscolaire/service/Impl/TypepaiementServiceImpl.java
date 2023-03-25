package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.TypePaiement;
import com.institutscolaire.gestioninstitutscolaire.service.TypepaiementService;

@Service
public class TypepaiementServiceImpl implements TypepaiementService {

	@Override
	public Optional<TypePaiement> findByCode(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<TypePaiement> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int max() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int nbre() {
		// TODO Auto-generated method stub
		return 0;
	}

}
