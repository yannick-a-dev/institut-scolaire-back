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

import com.institutscolaire.gestioninstitutscolaire.model.Specialite;
import com.institutscolaire.gestioninstitutscolaire.service.SpecialiteService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class SpecialiteController {

	@Autowired
	private SpecialiteService specialiteService;
	
	@GetMapping("/specialites/7")
	public int getCode() {
		System.out.println("Get Numbers...");
		int x = specialiteService.nbre();
		System.out.println(x);
		if(x == 0) {
			return 0;
		}else {
			return specialiteService.max();
		}
	}
	
	@GetMapping("/specialites")
	public List<Specialite> list(){
		System.out.println("Get all Specialites...");
		return specialiteService.getAll();
	}
	
	@GetMapping("/specialites/{id}")
	public ResponseEntity<Specialite> get(@PathVariable String id){
		Optional<Specialite> cat = specialiteService.findByCode(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
