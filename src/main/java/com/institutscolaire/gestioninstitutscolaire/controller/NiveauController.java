package com.institutscolaire.gestioninstitutscolaire.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutscolaire.gestioninstitutscolaire.model.Niveau;
import com.institutscolaire.gestioninstitutscolaire.service.NiveauService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NiveauController {

	@Autowired
	private NiveauService niveauService;
	
	@GetMapping("/niveaus/7")
	public int getCode() {
		System.out.println("Get Numbers...");
		int x = niveauService.nbre();
		System.out.println(x);
		if(x == 0) {
			return 0;
		}else {
			return niveauService.max();
		}
	}
	
	@GetMapping("/niveaus")
	public List<Niveau> list(){
		System.out.println("Get all Niveaus...");
		return niveauService.getAll();
	}
	
	@GetMapping("/niveaus/{id}")
	public ResponseEntity<Niveau> get(@PathVariable String id){
		Optional<Niveau> cat = niveauService.findByCode(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
