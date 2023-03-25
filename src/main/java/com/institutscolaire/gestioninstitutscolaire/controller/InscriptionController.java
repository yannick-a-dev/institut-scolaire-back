package com.institutscolaire.gestioninstitutscolaire.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutscolaire.gestioninstitutscolaire.model.Inscription;
import com.institutscolaire.gestioninstitutscolaire.service.InscriptionService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class InscriptionController {

	@Autowired
	private InscriptionService inscriptionService;
	
	@GetMapping("/inscriptions")
	public List<Inscription> list(){
		System.out.println("Get all Inscriptions...");
		return inscriptionService.getAll();
	}
	
	@GetMapping("/inscriptions/{id}")
	public ResponseEntity<Inscription> get(@PathVariable Long id){
		System.out.println("Get Inscription By Id...");
		Optional<Inscription> cat = inscriptionService.findById(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("/inscriptions")
	public Long save(@RequestBody Inscription inscription) {
		return inscriptionService.save(inscription);
	}
	
	@PutMapping("/inscriptions/{code}")
	public void update(@PathVariable Long id, @RequestBody Inscription inscription) {
		inscriptionService.update(id, inscription);
	}
}
