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

import com.institutscolaire.gestioninstitutscolaire.model.Nationalite;
import com.institutscolaire.gestioninstitutscolaire.service.NationaliteService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NationaliteController {

	@Autowired
	private NationaliteService nationaliteService;
	
	@GetMapping("/nationalites")
	public List<Nationalite> list(){
		System.out.println("Get all Nationalites...");
		return nationaliteService.getAll();
	}
	
	@GetMapping("/nationalites/{id}")
	public ResponseEntity<Nationalite> get(@PathVariable String id){
		Optional<Nationalite> cat = nationaliteService.findByCode(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("/nationalites")
	public Long save(@RequestBody Nationalite categorie) {
		return nationaliteService.save(categorie);
	}
	
	@PutMapping("/nationalites/{code}")
	public void update(@PathVariable String code, @RequestBody Nationalite categorie) {
		nationaliteService.update(code, categorie);
	}
}
