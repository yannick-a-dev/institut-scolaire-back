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

import com.institutscolaire.gestioninstitutscolaire.model.Etablissement;
import com.institutscolaire.gestioninstitutscolaire.service.EtablissementService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class EtablissementController {

	@Autowired
	private EtablissementService etablissementService;
	
	@GetMapping("/etablissements/7")
	public int getCode() {
		System.out.println("Get Numbers...");
		int x = etablissementService.nbre();
		System.out.println(x);
		if(x == 0) {
			return 0;
		}else {
			return etablissementService.max();
		}
	}
	
	@GetMapping("/etablissements")
	public List<Etablissement> list(){
		System.out.println("Get all Etablissements...");
		return etablissementService.getAll();
	}
	
	@GetMapping("/etablissements/{id}")
	public ResponseEntity<Etablissement> get(@PathVariable Long id){
		Optional<Etablissement> cat = etablissementService.findById(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
