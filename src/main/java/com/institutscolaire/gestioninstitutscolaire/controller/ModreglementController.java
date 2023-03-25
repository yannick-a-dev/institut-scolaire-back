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

import com.institutscolaire.gestioninstitutscolaire.model.Modreglement;
import com.institutscolaire.gestioninstitutscolaire.service.ModreglementService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class ModreglementController {

	@Autowired
	private ModreglementService modreglementService;
	
	@GetMapping("/modreglements")
	public List<Modreglement> list(){
		System.out.println("Get all Modreglements...");
		return modreglementService.getAll();
	}
	
	@GetMapping("/modreglements/{id}")
	public ResponseEntity<Modreglement> get(@PathVariable String id){
		Optional<Modreglement> cat = modreglementService.findByCode(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("/modreglements")
	public Long save(@RequestBody Modreglement categorie) {
		return modreglementService.save(categorie);
	}
	
	@PutMapping("/modreglements/{code}")
	public void update(@PathVariable String code, @RequestBody Modreglement categorie) {
		modreglementService.update(code, categorie);
	}
	
	@DeleteMapping("/modreglements/{code}")
	public void delete(@PathVariable String code) {
		modreglementService.delete(code);
	}
}
