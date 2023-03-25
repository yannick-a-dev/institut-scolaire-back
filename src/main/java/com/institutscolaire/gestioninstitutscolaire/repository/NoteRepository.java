package com.institutscolaire.gestioninstitutscolaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutscolaire.gestioninstitutscolaire.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
