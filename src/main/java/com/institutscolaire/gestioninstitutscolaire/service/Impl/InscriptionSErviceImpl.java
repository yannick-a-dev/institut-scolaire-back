package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.Inscription;
import com.institutscolaire.gestioninstitutscolaire.service.InscriptionService;

@Service
public class InscriptionSErviceImpl implements InscriptionService {

	@Override
	public List<Inscription> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Inscription> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Long save(Inscription inscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long id, Inscription inscription) {
		// TODO Auto-generated method stub
		
	}

}
