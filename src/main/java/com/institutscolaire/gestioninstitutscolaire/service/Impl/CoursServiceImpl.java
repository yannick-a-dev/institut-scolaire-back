package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.Cours;
import com.institutscolaire.gestioninstitutscolaire.service.CoursService;

@Service
public class CoursServiceImpl implements CoursService {

	@Override
	public List<Cours> getALl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Cours> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Long save(Cours cours) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long id, Cours cours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
