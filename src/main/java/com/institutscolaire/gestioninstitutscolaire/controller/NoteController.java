package com.institutscolaire.gestioninstitutscolaire.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutscolaire.gestioninstitutscolaire.model.Note;
import com.institutscolaire.gestioninstitutscolaire.service.NoteService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NoteController {

	@Autowired
	private NoteService noteService;
	
	@GetMapping("/notes")
	public List<Note> list(){
		System.out.println("Get all Notes...");
		return noteService.getAll();
	}
	
	@GetMapping("/notes/{id}")
	public ResponseEntity<Note> get(@PathVariable Long id){
		Optional<Note> cat = noteService.findById(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("/notes")
	public Long save(@RequestBody Note note) {
		return noteService.save(note);
	}
	
	@PutMapping("/notes/{code}")
	public void update(@PathVariable Long id, @RequestBody Note note) {
		noteService.update(id,note);
	}
	
	@DeleteMapping("/notes/{id}")
	public void delete(@PathVariable Long id) {
		noteService.delete(id);
	}
}
