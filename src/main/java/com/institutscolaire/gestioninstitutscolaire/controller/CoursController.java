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

import com.institutscolaire.gestioninstitutscolaire.model.Cours;
import com.institutscolaire.gestioninstitutscolaire.service.CoursService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class CoursController {

	@Autowired
	private CoursService coursService;
	
	@GetMapping("/cours")
	public List<Cours> list(){
		System.out.println("Get all cours...");
		return coursService.getALl();
	}
	
	@GetMapping("/cours/{id}")
	public ResponseEntity<Cours> get(@PathVariable Long id){
		Optional<Cours> cat = coursService.findById(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("/cours")
	public Long save(@PathVariable Cours cours) {
		return coursService.save(cours);
	}
	
	@PutMapping("/cours/{code}")
	public void update(@PathVariable Long id, @RequestBody Cours cours) {
		coursService.update(id,cours);
	}
	
	@DeleteMapping("/cours/{id}")
	public void delete(@PathVariable Long id) {
		coursService.delete(id);
	}
}
