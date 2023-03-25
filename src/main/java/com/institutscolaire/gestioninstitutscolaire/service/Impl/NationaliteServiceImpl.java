package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.Nationalite;
import com.institutscolaire.gestioninstitutscolaire.service.NationaliteService;

@Service
public class NationaliteServiceImpl implements NationaliteService {

	@Override
	public List<Nationalite> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Nationalite> findByCode(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Long save(Nationalite categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(String code, Nationalite categorie) {
		// TODO Auto-generated method stub
		
	}

}
