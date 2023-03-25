package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.List;
import java.util.Optional;

import com.institutscolaire.gestioninstitutscolaire.model.Note;

public interface NoteService {

	List<Note> getAll();

	Optional<Note> findById(Long id);

	Long save(Note note);

	void update(Long id, Note note);

	void delete(Long id);

}
