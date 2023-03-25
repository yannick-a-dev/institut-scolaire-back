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

import com.institutscolaire.gestioninstitutscolaire.model.Matiere;
import com.institutscolaire.gestioninstitutscolaire.service.MatiereService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class MatiereController {

	@Autowired
	private MatiereService matiereService;
	
	@GetMapping("/matieres/7")
	public int getCode() {
		System.out.println("Get Numbers...");
		int x = matiereService.nbre();
		System.out.println(x);
		if(x == 0) {
			return 0;
		}else {
			return matiereService.max();
		}
	}
	
	@GetMapping("/matiers")
	public List<Matiere> list(){
		System.out.println("Get all Matieres...");
		return matiereService.getAll();
	}
	
	@GetMapping("/matieres/{id}")
	public ResponseEntity<Matiere> get(@PathVariable Long id){
		Optional<Matiere> cat = matiereService.findById(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
