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
import com.institutscolaire.gestioninstitutscolaire.model.Enseignant;
import com.institutscolaire.gestioninstitutscolaire.service.EnseignantService;

import jakarta.servlet.ServletContext;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class EnseignantController {

	@Autowired
	private EnseignantService enseignantService;
	
	@Autowired
	ServletContext servletContext;
	
	@GetMapping("/enseignants/7")
	public int getCode() {
		System.out.println("Get Numbers...");
		int x = enseignantService.nbre();
		System.out.println(x);
		if(x == 0) {
			return 0;
		}else {
			return enseignantService.max();
		}
	}
	
	@GetMapping("/enseignants")
	public List<Enseignant> list(){
		System.out.println("Get all Enseignants...");
		return enseignantService.getAll();
	}
	
	@GetMapping("/enseignants/{id}")
	public ResponseEntity<Enseignant> get(@PathVariable Long id){
		Optional<Enseignant> cat = enseignantService.findByCode(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
