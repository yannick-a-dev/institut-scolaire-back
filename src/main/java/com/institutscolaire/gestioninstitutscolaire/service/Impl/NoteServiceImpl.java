package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.Note;
import com.institutscolaire.gestioninstitutscolaire.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService {

	@Override
	public List<Note> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Note> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Long save(Note note) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long id, Note note) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
