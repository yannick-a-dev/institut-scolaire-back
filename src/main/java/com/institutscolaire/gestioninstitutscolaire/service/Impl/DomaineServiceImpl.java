package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.Domaine;
import com.institutscolaire.gestioninstitutscolaire.service.DomaineService;

@Service
public class DomaineServiceImpl implements DomaineService {

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
	public List<Domaine> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Domaine> findByCode(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
