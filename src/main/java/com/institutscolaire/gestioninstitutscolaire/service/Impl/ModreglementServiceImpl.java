package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.Modreglement;
import com.institutscolaire.gestioninstitutscolaire.service.ModreglementService;

@Service
public class ModreglementServiceImpl implements ModreglementService {

	@Override
	public List<Modreglement> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Modreglement> findByCode(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Long save(Modreglement categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(String code, Modreglement categorie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String code) {
		// TODO Auto-generated method stub
		
	}

}
