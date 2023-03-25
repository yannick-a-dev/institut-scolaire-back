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

import com.institutscolaire.gestioninstitutscolaire.model.TypePaiement;
import com.institutscolaire.gestioninstitutscolaire.service.TypepaiementService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TypepaiementController {

	@Autowired
	private TypepaiementService typepaiementService;
	
	@GetMapping("/typepaiements/7")
	public int getCode() {
		System.out.println("Get Numbers...");
		int x = typepaiementService.nbre();
		System.out.println(x);
		if(x == 0) {
			return 0;
		}else {
			return typepaiementService.max();
		}
	}
	
	@GetMapping("/typepaiements")
	public List<TypePaiement> list(){
		System.out.println("Get all Typepaiements...");
		return typepaiementService.getAll();
	}
	
	@GetMapping("/typepaiements/{id}")
	public ResponseEntity<TypePaiement> get(@PathVariable String id){
		Optional<TypePaiement> cat = typepaiementService.findByCode(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
