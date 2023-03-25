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

import com.institutscolaire.gestioninstitutscolaire.model.Domaine;
import com.institutscolaire.gestioninstitutscolaire.service.DomaineService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class DomaineController {

	@Autowired
	private DomaineService domaineService;
	
	@GetMapping("/domaines/7")
	public int getCode() {
		System.out.println("Get Numbers...");
		int x = domaineService.nbre();
		System.out.println(x);
		if(x == 0) {
			return 0;
		}else {
			return domaineService.max();
		}
	}
	
	@GetMapping("/domaines")
	public List<Domaine> list(){
		System.out.println("Get all Domaines...");
		return domaineService.getAll();
	}
	
	@GetMapping("/domaines/{id}")
	public ResponseEntity<Domaine> get(@PathVariable String id){
		Optional<Domaine> cat = domaineService.findByCode(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
