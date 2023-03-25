package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.Banque;
import com.institutscolaire.gestioninstitutscolaire.service.BanqueService;

@Service
public class BanqueServiceImpl implements BanqueService {

	@Override
	public List<Banque> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Banque> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Long save(Banque categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(String code, Banque categorie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}



}
